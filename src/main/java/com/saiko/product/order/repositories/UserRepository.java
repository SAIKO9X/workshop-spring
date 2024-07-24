package com.saiko.product.order.repositories;

import com.saiko.product.order.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
