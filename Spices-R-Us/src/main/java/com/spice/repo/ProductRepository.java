package com.spice.repo;

import java.util.List;

import com.spice.model.SpiceProduct;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Spice-R-Us Products
 */
@Repository
public interface ProductRepository extends CrudRepository<SpiceProduct, Integer> {
 
    @Query("FROM SpiceProduct ORDER By name ASC")
    public List<SpiceProduct> findAllOrderByNameASC();

    @Query("FROM SpiceProduct ORDER BY price ASC")
    public List<SpiceProduct> findAllOrderByPriceASC();

    @Query("FROM SpiceProduct ORDER BY spicyLevel ASC")
    public List<SpiceProduct> findAllOrderBySpiceASC();

}
