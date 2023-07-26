package com.spice.controller;

import com.spice.model.SpiceUser;

import java.security.Principal;
import java.util.Optional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import com.spice.repo.ProductRepository;
import com.spice.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    
    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private UserRepository userRepo;

    /**
     * Shop page mapping for GET requests to /shop
     * @param model the model to use for JSP
     * @return shop jsp
     */
    @GetMapping("/shop")
    public String shopPage(Principal principal, Model model) {
        ObjectWriter ow = new ObjectMapper().writer();

        String defaultJson = "";
        String nameJson = "";
        String priceJson = "";
        String spiceJson = "";

        try {
            defaultJson = ow.writeValueAsString(productRepo.findAll());
            nameJson = ow.writeValueAsString(productRepo.findAllOrderByNameASC());
            priceJson = ow.writeValueAsString(productRepo.findAllOrderByPriceASC());
            spiceJson = ow.writeValueAsString(productRepo.findAllOrderBySpiceASC());
        } catch (Exception e) {
            System.out.println(e);
        }

        model.addAttribute("spiceProducts", defaultJson);
        model.addAttribute("nameFilter", nameJson);
        model.addAttribute("priceFilter", priceJson);
        model.addAttribute("spiceFilter", spiceJson);
        
        return "shop";
    }


    /**
     * Product page mapping for GET requests to /product from /recipe
     * @param model the model to use for JSP
     * @param id the id of the spice product to access
     * @return product jsp
     */
    @GetMapping("/shop/product")
    public String productPage(Principal principal, Model model, @RequestParam int id) {

        model.addAttribute("product", productRepo.findById(id).get());

        if(principal == null) {
            model.addAttribute("discounted", false);
            model.addAttribute("disabledButtons", 3);
        } else {
            Optional<SpiceUser> u = userRepo.findByUsername(principal.getName());
            if(u.get().getRoles().contains("ROLE_HOMECOOK") || u.get().getRoles().contains("ROLE_ENTHUSIAST") || u.get().getRoles().contains("ROLE_BUSINESS")) {
                model.addAttribute("discounted", true);
                String roles = u.get().getRoles();

                if (roles.contains("ROLE_HOMECOOK")) {
                    model.addAttribute("disabledButtons", 2);
                } else if (roles.contains("ROLE_ENTHUSIAST")) {
                    model.addAttribute("disabledButtons", 1);
                } else if (roles.contains("ROLE_BUSINESS")) {
                    model.addAttribute("disabledButtons", 0);
                }
                
            } else {
                model.addAttribute("discounted", false);
                model.addAttribute("disabledButtons", 3);
            }
        }

        return "product";

    }

}
