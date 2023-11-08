package example.nostrategy;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Processar um pagamento com cartão de crédito
        processor.processPayment(100.0, "CREDIT_CARD");

        // Processar um pagamento com PayPal
        processor.processPayment(75.0, "PAYPAL");

        // ...e assim por diante para os diferentes métodos de pagamento
    }
}
