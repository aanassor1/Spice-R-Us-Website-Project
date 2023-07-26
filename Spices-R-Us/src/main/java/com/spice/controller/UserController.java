package com.spice.controller;

import javax.validation.Valid;

import com.spice.model.SpiceUser;
import com.spice.repo.UserRepository;
import com.spice.service.UserService;
import com.spice.validator.SpiceUserValidator;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controller for all user related mappings.
 */
@Controller
public class UserController {
    
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepo;

    @InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(new SpiceUserValidator(userRepo));
	}

    /**
     * Login page mapping for GET requests to /login
     * @param spiceUser the model Attribute
     * @param model the model to use for JSP
     * @return login JSP
     */
    @GetMapping("/login")
    public String login(@ModelAttribute SpiceUser spiceUser, Model model){
        model.addAttribute("user", new SpiceUser()); 
        return "login";
    }

    /**
     * Register page mapping for GET requests to /register
     * @param model the model to use for JSP
     * @return register jsp
     */
    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("spiceUser", new SpiceUser()); 
        return "register";
    }
    
    /**
     * POST request to register new user using register form.
     * @param spiceUser the model attribute
     * @param result the error checking for validation
     * @return redirection to login jsp
     */
    @PostMapping("/registerUser")
    public String registerUser(@Valid @ModelAttribute SpiceUser spiceUser, BindingResult result) {
        if (result.hasErrors()) {
			return "register";
		}

        userService.registerUser(spiceUser);
        return "redirect:/login";
    }

}
