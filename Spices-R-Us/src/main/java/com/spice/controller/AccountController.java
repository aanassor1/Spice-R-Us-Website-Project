package com.spice.controller;

import java.security.Principal;
import java.util.Optional;

import com.spice.model.SpiceUser;
import com.spice.repo.UserRepository;
import com.spice.service.SpiceUserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @Autowired
    private SpiceUserDetailsService userDetailService;

    @Autowired
    private UserRepository repo;

    private String role_admin = "ROLE_ADMIN";

    /**
     * Account page mapping for GET requests to /account
     * @param principal the current user
     * @return account JSP
     */
    @GetMapping("/account")
    public String account(Principal principal, Model model) {
        //Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(principal == null) {
            return "redirect:/login";
        } else {
            Optional<SpiceUser> u = repo.findByUsername(principal.getName());
            model.addAttribute("spiceUser", userDetailService.loadUserByUsername(principal.getName()));
            String role = u.get().getRoles().split(",")[u.get().getRoles().split(",").length-1];
            if (role.equals(role_admin)) {
                role = "None";
                model.addAttribute("membershipLevel", role);
                return "account-dashboard";
            }
            role = role.substring(5);
            role = role.substring(0,1).toUpperCase() + role.substring(1).toLowerCase();
            model.addAttribute("membershipLevel", role);
            return "account-dashboard";
        }
    }

     /**
     * Dashboard page mapping for GET requests to /account-dashboard from /account
     * @param principal the current user
     * @param model the model to use for JSP
     * @return account-dashboard jsp
     */
    @GetMapping("/account/dashboard")
    public String dashboard(Principal principal, Model model) {
        Optional<SpiceUser> u = repo.findByUsername(principal.getName());
        model.addAttribute("spiceUser", userDetailService.loadUserByUsername(principal.getName()));
        String role = u.get().getRoles().split(",")[u.get().getRoles().split(",").length-1];
        if (role.equals(role_admin)) {
            role = "None";
            model.addAttribute("membershipLevel", role);
            return "account-dashboard";
        }
        role = role.substring(5);
        role = role.substring(0,1).toUpperCase() + role.substring(1).toLowerCase();
        model.addAttribute("membershipLevel", role);
        return "account-dashboard";
    }

    /**
     * Membership page mapping for GET requests to /account-membership from /account
     * @param principal the current user
     * @param model the model to use for JSP
     * @return account-membership jsp
     */
    @GetMapping("/account/membership")
    public String membership(Principal principal, Model model) {
        Optional<SpiceUser> u = repo.findByUsername(principal.getName());
        String role = (u.get().getRoles().split(",")[u.get().getRoles().split(",").length-1]);
        if (role.equals(role_admin)) {
            role = "None";
            model.addAttribute("membershipLevel", role);
            return "account-membership";
        }
        role = role.substring(5);
        role = role.substring(0,1).toUpperCase() + role.substring(1).toLowerCase();
        model.addAttribute("membershipLevel", role);
        return "account-membership";
    }
}
