package dev.Rignu1503.creacionales.builder.service;

import dev.Rignu1503.creacionales.builder.model.OrderModel;

import java.time.LocalDateTime;
import java.util.List;

public class OrderService {

    public OrderModel createOrder(String customer, List<String> products) {

        double subtotal = 200;
        double taxes = subtotal * 0.19;
        double shipping = 15;
        double total = subtotal + taxes + shipping;

        return new OrderModel.OrderBuilder()
                .customer(customer)
                .products(products)
                .subtotal(subtotal)
                .taxes(taxes)
                .shipping(shipping)
                .total(total)
                .status("PENDING")
                .createdAt(LocalDateTime.now())
                .build();
    }
}