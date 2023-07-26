package com.spice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import com.spice.model.BasketProduct;
import com.spice.model.SpiceBasket;
import com.spice.model.SpiceProduct;
import com.spice.model.SpiceUser;
import com.spice.repo.BasketRepository;
import com.spice.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpiceBasketService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private BasketRepository basketRepo;

    @SuppressWarnings("unchecked")
    public void addProductToBasket(SpiceProduct product, int newBasketWeight, SpiceUserDetails principal, HttpServletRequest request) {

        // First get list of basket products from the user/session
        if (principal != null) {
            Optional<SpiceUser> user = userRepo.findByUsername(principal.getUsername());
            SpiceBasket basket = basketRepo.findByUser(user.get());
            List<BasketProduct> products = basket.getProducts();

            for (BasketProduct prod : products) {
                SpiceProduct spiceProduct = prod.getProduct();
                if (spiceProduct.getId() == product.getId()) {
                    if (prod.getInitialBasketWeight() == newBasketWeight) {
                        prod.setQuantity(prod.getQuantity() + 1);
                        basketRepo.save(basket);
                        return;
                    }
                }
            }
            BasketProduct basketProduct = new BasketProduct();
            basketProduct.setProduct(product);
            basketProduct.setInitialBasketWeight(newBasketWeight);
            basket.getProducts().add(basketProduct);
            basketRepo.save(basket);
        } else {
            List<BasketProduct> products = (List<BasketProduct>) request.getSession().getAttribute("SESSION_BASKET");

            if (products != null) {
                for (BasketProduct prod : products) {
                    SpiceProduct spiceProduct = prod.getProduct();
                    if (spiceProduct.getId() == product.getId()) {
                        if (prod.getInitialBasketWeight() == newBasketWeight) {
                            prod.setQuantity(prod.getQuantity() + 1);
                            request.getSession().setAttribute("SESSION_BASKET", products);
                            return;
                        }
                    }
                }

            } else {
                products = new ArrayList<BasketProduct>();
            }

            BasketProduct basketProduct = new BasketProduct();
            System.err.println(basketProduct.getId());
            basketProduct.setProduct(product);
            basketProduct.setInitialBasketWeight(newBasketWeight);
            products.add(basketProduct);
            request.getSession().setAttribute("SESSION_BASKET", products);

        }
    }
 
    @SuppressWarnings("unchecked")
    public void removeProductFromBasket(BasketProduct product, SpiceUserDetails principal, HttpServletRequest request) {

        if(principal != null) {
            Optional<SpiceUser> user = userRepo.findByUsername(principal.getUsername());
            SpiceBasket basket = basketRepo.findByUser(user.get());
            basket.getProducts().remove(product);
            basketRepo.save(basket);
            return;
        }

        List<BasketProduct> products = (List<BasketProduct>) request.getSession().getAttribute("SESSION_BASKET");
        System.err.println(product.getProduct().getName());
        products.remove(product);
        request.getSession().setAttribute("SESSION_BASKET", products);

    }

}
