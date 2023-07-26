package com.spice.controller;

import java.security.Principal;

import com.spice.repo.RecipeRepository;

import org.springframework.beans.factory.annotation.Autowired;

// import com.spice.repo.RecipeRepository;
// import com.spice.repo.UserRepository;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecipeController {
    
    @Autowired
    private RecipeRepository recipeRepo;

    // @Autowired
    // private UserRepository userRepo;

    /**
     * Recipe page mapping for GET requests to /recipe
     * @param model the model to use for JSP
     * @return recipe jsp
     */
    @GetMapping("/recipe")
    public String recipePage(Principal principal, Model model) {
        model.addAttribute("spiceRecipe", recipeRepo.findAll());

        return "recipe";
    }


    /**
     * Instruction page mapping for GET requests to /instruction from /recipe
     * @param model the model to use for JSP
     * @param id the id of the recipe to access
     * @return recipe_instruction jsp
     */
    @GetMapping("/recipe/instruction")
    public String instructionPage(Model model, @RequestParam int id) {
        model.addAttribute("recipe", recipeRepo.findById(id).get());
        return "recipe_instruction";
    }

}
