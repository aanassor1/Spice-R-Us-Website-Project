package com.spice.service;

import java.util.List;

import com.spice.model.SpiceProduct;
import com.spice.repo.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IProductService implements ProductService {
    
    @Autowired
    private ProductRepository productRepo;

    @Override
    public List<SpiceProduct> findAllOrderByNameASC() {
        return productRepo.findAllOrderByNameASC();
    }

    @Override
    public List<SpiceProduct> findAllOrderByPriceASC() {
        return productRepo.findAllOrderByPriceASC();
    }

    @Override
    public List<SpiceProduct> findAllOrderBySpiceASC() {
        return productRepo.findAllOrderBySpiceASC();
    }

}
