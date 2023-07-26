package com.spice.service;

import java.security.Principal;

import com.spice.model.SpicePayment;
import com.spice.model.SpiceUser;
import com.spice.repo.PaymentRepository;
import com.spice.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Payment service that implements the payment service interface.
 */
@Service
public class IPaymentService implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepo;

    @Autowired
    private UserRepository userRepo;

    @Override
    public void checkoutDetails(SpicePayment payment, Principal principal) {

        paymentRepo.save(payment);

        if (principal != null) {
            SpiceUser user = userRepo.findByUsername(principal.getName()).get();
            user.setPayment(payment);
            userRepo.save(user);
        }    
    }
    

}
