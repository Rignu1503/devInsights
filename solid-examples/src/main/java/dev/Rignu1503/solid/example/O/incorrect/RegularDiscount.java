package dev.Rignu1503.solid.example.O.incorrect;

import dev.Rignu1503.solid.example.O.incorrect.interfaces.DiscountStrategy;

public class RegularDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price * 0.1;
    }
}
