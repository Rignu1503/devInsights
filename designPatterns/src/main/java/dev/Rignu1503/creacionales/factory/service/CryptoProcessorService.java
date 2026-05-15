package dev.Rignu1503.creacionales.factory.service;

import dev.Rignu1503.creacionales.factory.interfaces.PaymentProcessorInterface;
import dev.Rignu1503.creacionales.factory.model.PaymentResult;

/**
 * Procesador de pagos con criptomonedas
 */
public class CryptoProcessorService implements PaymentProcessorInterface {

    @Override
    public PaymentResult processPayment(double amount, String walletAddress) {
        System.out.println("Procesando $" + amount + " a wallet: " + walletAddress);

        // Simulación de integración con blockchain
        String transactionId = "BTC-" + System.currentTimeMillis();

        return new PaymentResult("PENDING", transactionId,
                "Transacción blockchain en proceso");
    }
}