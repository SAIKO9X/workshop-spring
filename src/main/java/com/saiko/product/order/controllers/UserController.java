package com.saiko.product.order.controllers;

import com.saiko.product.order.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "93618745", "maria123", "maria@gmail.com");
        return ResponseEntity.ok().body(u);
    }
}
