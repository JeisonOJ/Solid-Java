package paymentProcessor;

public class PayPalPayment implements IPaymentMethod {

  @Override
  public void processPayment() {
    System.out.println("Paying with paypal");

  }

}
