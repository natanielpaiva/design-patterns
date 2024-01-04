package example.structural.adapter;

public class Stripe {

    public void makePayment(String amount){
        System.out.println("Efetuando pagamento via stripe " + amount);
    }

}
