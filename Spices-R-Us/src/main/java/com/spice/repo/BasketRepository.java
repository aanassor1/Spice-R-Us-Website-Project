package com.spice.repo;

import com.spice.model.SpiceBasket;
import com.spice.model.SpiceUser;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Spice-R-Us Basket
 */
@Repository
public interface BasketRepository extends CrudRepository<SpiceBasket, Integer> {
    
    public SpiceBasket findByUser(SpiceUser user);

}
