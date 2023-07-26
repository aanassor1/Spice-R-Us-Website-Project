package com.spice.service;

import java.util.ArrayList;
import java.util.List;

import com.spice.model.BasketProduct;
import com.spice.model.SpiceBasket;
import com.spice.model.SpiceUser;
import com.spice.repo.BasketRepository;
import com.spice.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * User service that implements the user service interface.
 */
@Service
public class IUserService implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private BasketRepository basketRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void registerUser(SpiceUser user) {

        String password = user.getPassword();
        user.setPassword(passwordEncoder.encode(password));

        user.setRoles("ROLE_USER");

        userRepo.save(user);

        SpiceBasket basket = new SpiceBasket();
        basket.setUser(user);
        List<BasketProduct> emptyBasket = new ArrayList<BasketProduct>();
        basket.setProducts(emptyBasket);

        basketRepo.save(basket);

        user.setBasket(basket);

        userRepo.save(user);
    }
}