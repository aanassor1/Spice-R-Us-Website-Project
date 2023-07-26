package com.spice.repo;

import com.spice.model.BasketProduct;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Spice-R-Us Products in Basket
 */
@Repository
public interface BasketProductRepository extends CrudRepository<BasketProduct, Integer> {

}
