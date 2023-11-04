package example.strategy;
/**
 * Instagram: @natanieltech
 * LinkedIn: https://www.linkedin.com/in/natanielpaiva/
 * YouTube: https://www.youtube.com/@NatanielTech
 */
public class CreditCardPayment implements PaymentStrategy{
    private String name;
    private String cardNumber;

    private String cvv;

    private String dateOfExpiry;

    public CreditCardPayment(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " pagamento feito via cartão de crédito");
    }
}
