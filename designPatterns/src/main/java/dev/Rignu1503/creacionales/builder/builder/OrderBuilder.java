package dev.Rignu1503.creacionales.builder.builder;

import dev.Rignu1503.creacionales.builder.model.OrderModel;

import java.time.LocalDateTime;
import java.util.List;

public class OrderBuilder {

    private String customer;
    private List<String> products;
    private double subtotal;
    private double taxes;
    private double shipping;
    private double total;
    private String status;
    private LocalDateTime createdAt;

    public OrderBuilder customer(String customer) {
        this.customer = customer;
        return this;
    }

    public OrderBuilder products(List<String> products) {
        this.products = products;
        return this;
    }

    public OrderBuilder subtotal(double subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    public OrderBuilder taxes(double taxes) {
        this.taxes = taxes;
        return this;
    }

    public OrderBuilder shipping(double shipping) {
        this.shipping = shipping;
        return this;
    }

    public OrderBuilder total(double total) {
        this.total = total;
        return this;
    }

    public OrderBuilder status(String status) {
        this.status = status;
        return this;
    }

    public OrderBuilder createdAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderModel build() {

        return new OrderModel(
                customer,
                products,
                subtotal,
                taxes,
                shipping,
                total,
                status,
                createdAt
        );
    }
}