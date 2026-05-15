package dev.Rignu1503.creacionales.factory.interfaces;

import dev.Rignu1503.creacionales.factory.model.PaymentResult;

/**
 * Interfaz común para todos los procesadores de pago
 */
public interface PaymentProcessorInterface {
    PaymentResult processPayment(double amount, String paymentDetails);
}
