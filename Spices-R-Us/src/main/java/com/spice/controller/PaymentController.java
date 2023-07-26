package com.spice.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.spice.model.BasketProduct;
import com.spice.model.SpicePayment;
import com.spice.model.SpiceUser;
import com.spice.repo.PaymentRepository;
import com.spice.repo.UserRepository;
import com.spice.service.PaymentService;
import com.spice.validator.SpicePaymentValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller for all payment related mappings
 */
@Controller
public class PaymentController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PaymentRepository paymentRepo;

    @Autowired
    private PaymentService paymentService;

    /**
     * Payment page mapping for GET requests to /payment.
     * Checks if user's basket is empty.
     * 
     * @param model     the payment model to use for JSP
     * @param principal the current user
     * @param request   requests to HTTP Session
     * @return <b>payment jsp</b> if basket is not empty
     *         or <b>redirection to shop</b> is user basket is empty.
     */
    @GetMapping("/payment")
    @SuppressWarnings("unchecked")
    public String payment(Model model, Principal principal, HttpServletRequest request, @RequestParam float price,
            @RequestParam float discount, @RequestParam float total) {
        // If there is a user logged in
        if (principal != null) {
            // Redirect to shop page is there are no products in basket.
            SpiceUser user = userRepo.findByUsername(principal.getName()).get();
            if (user.getBasket().getProducts().isEmpty()) {
                return "redirect:/shop";
            }
            model.addAttribute("basketProducts", user.getBasket().getProducts());

        }
        // If there is no logged in user
        else {
            HttpSession session = request.getSession(false);
            if (session == null || session.getAttribute("SESSION_BASKET") == null) {
                // Redirect to shop page is there are no products in basket.
                return "redirect:/shop";
            }
            List<BasketProduct> products = (List<BasketProduct>) session.getAttribute("SESSION_BASKET");
            model.addAttribute("basketProducts", products);

        }

        // Direct to payment page
        model.addAttribute("payment", new SpicePayment());
        model.addAttribute("price", price);
        model.addAttribute("discount", discount);
        model.addAttribute("total", total);
        return "payment";
    }

    /**
     * POST requests to /payment to fill out payment form.
     * 
     * @param payment   the Model Attribute for the payment form
     * @param result    the result from validation
     * @param principal the current user
     * @param session   the current HTTP session
     * @param model     model to use for jsp
     * @return <b>orderInfo</b> order information if form is correct
     *         or <b>payment page</b> if payment form has errors.
     */
    @PostMapping("/paymentForm")
    @SuppressWarnings("unchecked")
    public String paymentForm(@Valid @ModelAttribute("payment") SpicePayment payment, BindingResult result,
            Principal principal,
            Model model, HttpServletRequest request) {
        HttpSession session = request.getSession(false);

        if (result.hasErrors()) {
            if (principal != null) {
                SpiceUser user = userRepo.findByUsername(principal.getName()).get();
                List<BasketProduct> products = user.getBasket().getProducts();
                model.addAttribute("basketProducts", products);
            } else {
                List<BasketProduct> products = (List<BasketProduct>) session.getAttribute("SESSION_BASKET");
                model.addAttribute("basketProducts", products);
            }
            return "payment";
        }

        paymentService.checkoutDetails(payment, principal);
        return "orderInfo";
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new SpicePaymentValidator(paymentRepo));
    }

}
