package dev.Rignu1503.solid.example.O.correct;

public class DiscountCalculator {

    public double calculateDiscount(String type, double price) {
        if (type.equals("regular")) {
            return price * 0.1;
        } else if (type.equals("christmas")) {
            return price * 0.2;
        } else {
            return 0;
        }
    }
}
