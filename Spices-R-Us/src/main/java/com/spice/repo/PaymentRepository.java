package com.spice.repo;

import com.spice.model.SpicePayment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Repository for Spice-R-Us Payment
 */
@Repository
public interface PaymentRepository extends CrudRepository<SpicePayment, Integer> {
    


}
