package com.saiko.product.order.repositories;

import com.saiko.product.order.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
