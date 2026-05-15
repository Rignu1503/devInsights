package dev.Rignu1503.creacionales.factory.factory;

import dev.Rignu1503.creacionales.factory.interfaces.PaymentProcessorInterface;
import dev.Rignu1503.creacionales.factory.service.CreditCardProcessorService;
import dev.Rignu1503.creacionales.factory.service.CryptoProcessorService;
import dev.Rignu1503.creacionales.factory.service.PayPalProcessorService;

/**
 * Factory Method - Crea instancias de procesadores de pago
 */
public class PaymentProcessorFactory {

    public static PaymentProcessorInterface createProcessor(String paymentMethod) {
        switch (paymentMethod.toLowerCase()) {
            case "credit_card":
                return new CreditCardProcessorService();
            case "paypal":
                return new PayPalProcessorService();
            case "crypto":
                return new CryptoProcessorService();
            default:
                throw new IllegalArgumentException(
                        "Método de pago no soportado: " + paymentMethod
                );
        }
    }
}
