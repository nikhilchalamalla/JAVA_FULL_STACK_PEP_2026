package interfaces;

public class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}
