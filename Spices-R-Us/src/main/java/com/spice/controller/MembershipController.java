package com.spice.controller;

import java.security.Principal;
import java.util.Optional;

import com.spice.model.SpiceProduct;
import com.spice.model.SpiceUser;
import com.spice.repo.ProductRepository;
import com.spice.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class MembershipController {

    @Autowired
    private UserRepository repo;

    @Autowired
    private ProductRepository prod_repo;
    
    private String role_admin = "ROLE_ADMIN";
    private String role_homecook = "ROLE_HOMECOOK";
    private String role_enthusiast = "ROLE_ENTHUSIAST";
    private String role_business = "ROLE_BUSINESS";

    @RequestMapping("/homecook")
    public String amateurLevel(Principal principal, Model model) {
        Optional<SpiceUser> u = repo.findByUsername(principal.getName());
        if (u.get().getRoles().contains(role_homecook)) {
            return "redirect:/account/membership";
        } else {
            if (u.get().getRoles().contains(role_admin)) {
                u.get().setRoles(role_admin + "," + role_homecook);
            } else {
                u.get().setRoles(role_homecook);
            }
            repo.save(u.get());

            Iterable<SpiceProduct> prods = prod_repo.findAll();
            for (SpiceProduct spiceProduct : prods) {
                spiceProduct.setDiscount(0.95f);
                spiceProduct.setDiscountPrice(spiceProduct.getDiscount()*spiceProduct.getPrice());
                prod_repo.save(spiceProduct);
            }

            return "redirect:/account/membership";
        }
    }

    @RequestMapping("/enthusiast")
    public String semiLevel(Principal principal, Model model) {
        Optional<SpiceUser> u = repo.findByUsername(principal.getName());
        if (u.get().getRoles().contains(role_enthusiast)) {
            return "redirect:/account/membership";
        } else {
            if (u.get().getRoles().contains(role_admin)) {
                u.get().setRoles(role_admin + "," + role_enthusiast);
            } else {
                u.get().setRoles(role_enthusiast);
            }
            repo.save(u.get());

            Iterable<SpiceProduct> prods = prod_repo.findAll();
            for (SpiceProduct spiceProduct : prods) {
                spiceProduct.setDiscount(0.90f);
                spiceProduct.setDiscountPrice(spiceProduct.getDiscount()*spiceProduct.getPrice());
                prod_repo.save(spiceProduct);
            }

            return "redirect:/account/membership";
        }
    }

    @RequestMapping("/business")
    public String proLevel(Principal principal, Model model) {
        Optional<SpiceUser> u = repo.findByUsername(principal.getName());
        if (u.get().getRoles().contains(role_business)) {
            return "redirect:/account/membership";
        } else {
            if (u.get().getRoles().contains(role_admin)) {
                u.get().setRoles(role_admin + "," + role_business);
            } else {
                u.get().setRoles(role_business);
            }
            repo.save(u.get());

            Iterable<SpiceProduct> prods = prod_repo.findAll();
            for (SpiceProduct spiceProduct : prods) {
                spiceProduct.setDiscount(0.85f);
                spiceProduct.setDiscountPrice(spiceProduct.getDiscount()*spiceProduct.getPrice());
                prod_repo.save(spiceProduct);
            }

            return "redirect:/account/membership";
        }
    }
}