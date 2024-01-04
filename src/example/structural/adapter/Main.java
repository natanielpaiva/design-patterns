package example.structural.adapter;

public class Main {

    public static void main(String[] args){
        Paypal paypal = new Paypal();
        PaymentGateway paymentGateway = new PaypalAdapter(paypal);
        paymentGateway.processPayment("52464");

        Stripe stripe = new Stripe();

        PaymentGateway paymentGatewayStripe = new StripeAdapter(stripe);

        paymentGatewayStripe.processPayment("2222");


    }

}
