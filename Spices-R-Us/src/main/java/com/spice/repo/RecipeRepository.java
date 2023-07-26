package com.spice.repo;


import com.spice.model.SpiceRecipe;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Spice-R-Us Recipe
 */
@Repository
public interface RecipeRepository extends CrudRepository<SpiceRecipe, Integer> {

}