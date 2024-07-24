package com.saiko.product.order.repositories;

import com.saiko.product.order.entities.OrderItem;
import com.saiko.product.order.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
