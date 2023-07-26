package com.spice.service;

import java.util.List;

import com.spice.model.SpiceProduct;

public interface ProductService {

    List<SpiceProduct> findAllOrderByNameASC();

    List<SpiceProduct> findAllOrderByPriceASC();

    List<SpiceProduct> findAllOrderBySpiceASC();
    
}
