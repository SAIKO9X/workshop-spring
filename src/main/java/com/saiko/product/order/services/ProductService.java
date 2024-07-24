package com.saiko.product.order.services;

import com.saiko.product.order.entities.Product;
import com.saiko.product.order.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> user = productRepository.findById(id);
        return user.get();
    }
}

