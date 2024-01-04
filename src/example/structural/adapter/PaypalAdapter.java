package example.structural.adapter;

public class PaypalAdapter implements PaymentGateway{

    private Paypal paypal;

    public PaypalAdapter(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(String amount) {
        paypal.sendPayment(amount);
    }
}
