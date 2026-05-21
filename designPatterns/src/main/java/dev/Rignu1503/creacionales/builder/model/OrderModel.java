package dev.Rignu1503.creacionales.builder.model;

import java.util.List;
import java.time.LocalDateTime;

public class OrderModel {

    private String customer;
    private List<String> products;
    private double subtotal;
    private double taxes;
    private double shipping;
    private double total;
    private String status;
    private LocalDateTime createdAt;

    public OrderModel(
            String customer,
            List<String> products,
            double subtotal,
            double taxes,
            double shipping,
            double total,
            String status,
            LocalDateTime createdAt
    ) {
        this.customer = customer;
        this.products = products;
        this.subtotal = subtotal;
        this.taxes = taxes;
        this.shipping = shipping;
        this.total = total;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getCustomer() {
        return customer;
    }

    public List<String> getProducts() {
        return products;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTaxes() {
        return taxes;
    }

    public double getShipping() {
        return shipping;
    }

    public double getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void printOrder() {
        System.out.println("Customer: " + customer);
        System.out.println("Products: " + products);
        System.out.println("Total: $" + total);
    }
}
