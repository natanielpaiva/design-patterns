package example.strategy;

/**
 * Instagram: @natanieltech
 * LinkedIn: https://www.linkedin.com/in/natanielpaiva/
 * YouTube: https://www.youtube.com/@NatanielTech
 */
public class Main {

    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();

        Item item = new Item(25);
        Item item2 = new Item(25);
        Item item3 = new Item(25);
        cart.addItem(item);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.setPaymentStrategy(new PaypalPayment("nataniel.paiva@gmail.com", "adfadse4r23"));
        cart.checkout();

        Item item4 = new Item(25);
        cart.addItem(item4);
        cart.setPaymentStrategy(new CreditCardPayment("Nataniel", "2136574", "215", "10/12/2023"));
        cart.checkout();



    }
}
