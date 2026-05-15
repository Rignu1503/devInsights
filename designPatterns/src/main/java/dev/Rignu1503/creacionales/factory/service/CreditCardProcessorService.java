package dev.Rignu1503.creacionales.factory.service;

import dev.Rignu1503.creacionales.factory.interfaces.PaymentProcessorInterface;
import dev.Rignu1503.creacionales.factory.model.PaymentResult;

/**
 * Procesador de pagos con tarjeta de crédito
 */
public class CreditCardProcessorService implements PaymentProcessorInterface {

    @Override
    public PaymentResult processPayment(double amount, String cardNumber) {
        System.out.println("Procesando $" + amount + " con tarjeta **** " +
                cardNumber.substring(Math.max(0, cardNumber.length() - 4)));

        // Simulación de integración con Stripe, Mercado Pago, etc.
        String transactionId = "CC-" + System.currentTimeMillis();

        return new PaymentResult("APPROVED", transactionId, "Pago con tarjeta exitoso");
    }
}
