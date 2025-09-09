package dev.Rignu1503.solid.example.O.incorrect;

import dev.Rignu1503.solid.example.O.incorrect.interfaces.DiscountStrategy;

public class DiscountCalculator {

    private final DiscountStrategy discountStrategy;

    public DiscountCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculate(double price) {
        return discountStrategy.applyDiscount(price);
    }

}
