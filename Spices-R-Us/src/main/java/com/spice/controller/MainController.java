package com.spice.controller;

import java.security.Principal;
import java.util.Optional;

import com.spice.model.SpiceUser;
import com.spice.repo.ProductRepository;
import com.spice.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @Autowired
    private ProductRepository productRepo;
    
    @Autowired
    private UserRepository repo;

    /**
     * Home page mapping for GET requests to /
     * @param model the model to use for JSP
     * @return index JSP
     */
    @GetMapping("/")
    public String home(Principal principal, Model model) {
        String membershipLevel = "unregistered";
        if (principal != null) {
            Optional<SpiceUser> u = repo.findByUsername(principal.getName());
            membershipLevel = u.get().getRoles().split(",")[u.get().getRoles().split(",").length-1];
        }
        model.addAttribute("membershipLevel", membershipLevel);
        model.addAttribute("spiceProducts", productRepo.findAll());
        return "index";
    }
}
