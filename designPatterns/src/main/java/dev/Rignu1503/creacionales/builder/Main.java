package dev.Rignu1503.creacionales.builder;

import dev.Rignu1503.creacionales.builder.model.OrderModel;
import dev.Rignu1503.creacionales.builder.service.OrderService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        OrderModel order = orderService.createOrder(
                "Rigoberto",
                Arrays.asList("Keyboard", "Mouse", "Monitor")
        );

        order.printOrder();
    }
}
