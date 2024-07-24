package com.saiko.product.order.repositories;

import com.saiko.product.order.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
