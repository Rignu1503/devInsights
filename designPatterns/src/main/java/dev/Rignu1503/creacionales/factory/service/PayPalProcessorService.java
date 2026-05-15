package dev.Rignu1503.creacionales.factory.service;

import dev.Rignu1503.creacionales.factory.interfaces.PaymentProcessorInterface;
import dev.Rignu1503.creacionales.factory.model.PaymentResult;

/**
 * Procesador de pagos con PayPal
 */
public class PayPalProcessorService implements PaymentProcessorInterface {

    @Override
    public PaymentResult processPayment(double amount, String email) {
        System.out.println("Procesando $" + amount + " con PayPal: " + email);

        // Simulación de integración con API de PayPal
        String transactionId = "PP-" + System.currentTimeMillis();

        return new PaymentResult("APPROVED", transactionId, "Pago PayPal exitoso");
    }
}
