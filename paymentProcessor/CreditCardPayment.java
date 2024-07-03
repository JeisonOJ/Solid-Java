package paymentProcessor;

public class CreditCardPayment implements IPaymentMethod {

  @Override
  public void processPayment() {
    System.out.println("Paying with credit card");
  }

}
