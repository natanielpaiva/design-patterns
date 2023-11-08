package example.nostrategy;

public class PaymentProcessor {

    public void processPayment(double amount, String paymentType) {
        if ("CREDIT_CARD".equals(paymentType)) {
            // Lógica para processamento de pagamento por cartão de crédito
            System.out.println("Processando pagamento por cartão de crédito no valor de: " + amount);
            // Implementação específica...
        } else if ("DEBIT_CARD".equals(paymentType)) {
            // Lógica para processamento de pagamento por cartão de débito
            System.out.println("Processando pagamento por cartão de débito no valor de: " + amount);
            // Implementação específica...
        } else if ("PAYPAL".equals(paymentType)) {
            // Lógica para processamento de pagamento via PayPal
            System.out.println("Processando pagamento via PayPal no valor de: " + amount);
            // Implementação específica...
        } else if ("BITCOIN".equals(paymentType)) {
            // Lógica para processamento de pagamento com Bitcoin
            System.out.println("Processando pagamento com Bitcoin no valor de: " + amount);
            // Implementação específica...
        } else {
            throw new IllegalArgumentException("Método de pagamento inválido");
        }
    }
}

