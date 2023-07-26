package com.spice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.spice.model.BasketProduct;
import com.spice.model.SpiceProduct;
import com.spice.model.SpiceUser;
import com.spice.repo.BasketProductRepository;
import com.spice.repo.BasketRepository;
import com.spice.repo.ProductRepository;
import com.spice.repo.UserRepository;
import com.spice.service.SpiceBasketService;
import com.spice.service.SpiceUserDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasketController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private BasketRepository basketRepo;

    @Autowired
    private SpiceBasketService basketService;

    @Autowired
    private BasketProductRepository basketProductRepo;

    private String role_homecook = "ROLE_HOMECOOK";
    private String role_enthusiast = "ROLE_ENTHUSIAST";
    private String role_business = "ROLE_BUSINESS";


     /**
     * basket page mapping for GET requests to /basket
     * @param model the model to use for JSP
     * @param session create session between HTTP client and HTTP server (identify user)
     * @return basket jsp
     */
    @GetMapping("/basket")
    @SuppressWarnings("unchecked")
    public String basket(Model model, HttpSession session) {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof SpiceUserDetails) {
            SpiceUserDetails SUprincipal = (SpiceUserDetails) principal;
            SpiceUser user = userRepo.findByUsername(SUprincipal.getUsername()).get();
            model.addAttribute("spiceProducts", basketRepo.findByUser(user).getProducts());
            List<Float> basePrices = new ArrayList<Float>();
            for (BasketProduct product : basketRepo.findByUser(user).getProducts()) {
                basePrices.add(product.getProduct().getPrice() * product.getProduct().getDiscount() * (product.getInitialBasketWeight()/product.getProduct().getWeight()));
            }
            model.addAttribute("basePrices", basePrices);
            model.addAttribute("membershipLevel", user.getRoles().split(",")[user.getRoles().split(",").length-1]);
        } else {
            List<BasketProduct> products = (List<BasketProduct>) session.getAttribute("SESSION_BASKET");
            model.addAttribute("spiceProducts", products);
            List<Float> basePrices = new ArrayList<Float>();
            if (products != null) {
                for (BasketProduct product : products) {
                    basePrices.add(product.getProduct().getPrice() * (product.getInitialBasketWeight()/product.getProduct().getWeight()));
                }
                model.addAttribute("basePrices", basePrices);
                String membershipLevel = "unregistered";
                model.addAttribute("membershipLevel", membershipLevel);
            }

        }
        return "basket";
    }

    @GetMapping(value = "/addToBasket", params = { "id", "level" })
    public String addToBasket(@RequestParam("id") int id, @RequestParam("level") String level, Model model,
            HttpServletRequest request) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        SpiceUserDetails SUprincipal = null;
        SpiceProduct product = productRepo.findById(id).get();

        if (principal instanceof SpiceUserDetails) {
            SUprincipal = (SpiceUserDetails) principal;
            SpiceUser user = userRepo.findByUsername(SUprincipal.getUsername()).get();

            String role = user.getRoles().split(",")[user.getRoles().split(",").length - 1];

            if (level.equals("high") && role.equals(role_business) == false) {
                return "redirect:/shop";
            } else if (level.equals("mid")
                    && (role.equals(role_enthusiast) == false && role.equals(role_business) == false)) {
                return "redirect:/shop";
            } else if (level.equals("low")
                    && (role.equals(role_homecook) == false && role.equals(role_enthusiast) == false
                            && role.equals(role_business) == false)) {
                return "redirect:/shop";
            }
        }

        if (level.equals("high")) {
            basketService.addProductToBasket(product, product.getWeight() * 8, SUprincipal, request);
        } else if (level.equals("mid")) {
            basketService.addProductToBasket(product, product.getWeight() * 4, SUprincipal, request);
        } else if (level.equals("low")) {
            basketService.addProductToBasket(product, product.getWeight() * 2, SUprincipal, request);
        } else {
            basketService.addProductToBasket(product, product.getWeight(), SUprincipal, request);
        }

        return "redirect:/shop/product?id=" + id + "";
    }

    @GetMapping("/removeFromBasket")
    @SuppressWarnings("unchecked")
    public String removeFromBasket(@RequestParam int id, HttpServletRequest request) {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        SpiceUserDetails SUprincipal = null;
        BasketProduct product = null;

        if (principal instanceof SpiceUserDetails) {
            SUprincipal = (SpiceUserDetails) principal;
            product = basketProductRepo.findById(id).get();   
        } else {
            List<BasketProduct> products = (List<BasketProduct>) request.getSession().getAttribute("SESSION_BASKET");
            for(BasketProduct prod : products) {
                if(prod.getId() == id) {
                    product = prod;
                }
            }
        }

        basketService.removeProductFromBasket(product, SUprincipal, request);

        return "redirect:/basket";
    }
}
