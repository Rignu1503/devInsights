package dev.Rignu1503.creacionales.factory.model;

/**
 * Resultado del procesamiento de pago
 */
public class PaymentResult {
    private String status;
    private String transactionId;
    private String message;

    public PaymentResult(String status, String transactionId, String message) {
        this.status = status;
        this.transactionId = transactionId;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "PaymentResult{" +
                "status='" + status + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}