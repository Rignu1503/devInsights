package dev.Rignu1503.creacionales.factory;

import dev.Rignu1503.creacionales.factory.factory.PaymentProcessorFactory;
import dev.Rignu1503.creacionales.factory.interfaces.PaymentProcessorInterface;
import dev.Rignu1503.creacionales.factory.model.PaymentResult;

public class Main {

    public static void main(String[] args) {
        // Simular checkout con diferentes métodos de pago

        System.out.println("=== Procesando pagos ===\n");

        // Pago con tarjeta
        processCheckout("credit_card", 150.0, "4532-1234-5678-9012");

        System.out.println();

        // Pago con PayPal
        processCheckout("paypal", 89.99, "usuario@example.com");

        System.out.println();

        // Pago con criptomonedas
        processCheckout("crypto", 250.0, "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
    }

    private static void processCheckout(String method, double amount, String details) {
        try {
            PaymentProcessorInterface processor = PaymentProcessorFactory.createProcessor(method);
            PaymentResult result = processor.processPayment(amount, details);
            System.out.println("Resultado: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
