package com.spice.service;

import java.security.Principal;

import com.spice.model.SpicePayment;
/**
 * Interface for payments.
 */
public interface PaymentService {
    
    /**
     * Saves details input by user in the payment form into the database.
     * @param payment the model for payment
     * @param principal the current user
     */
    void checkoutDetails(SpicePayment payment, Principal principal);

}
