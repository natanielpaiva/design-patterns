package example.strategy;

public class PaypalPayment implements PaymentStrategy{

    private String email;

    private String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " pago via paypal");
    }
}
