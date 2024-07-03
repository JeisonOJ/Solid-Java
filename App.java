import paymentProcessor.CreditCardPayment;
import paymentProcessor.IPaymentMethod;
import paymentProcessor.PayPalPayment;
import paymentProcessor.PaymentProcessor;

public class App {

  public static void main(String[] args) {
    IPaymentMethod credit = new CreditCardPayment();
    IPaymentMethod paypal = new PayPalPayment();
    PaymentProcessor creditPayment = new PaymentProcessor(credit);
    PaymentProcessor paypalPayment = new PaymentProcessor(paypal);
    creditPayment.processPayment();
    paypalPayment.processPayment();
  }
}
