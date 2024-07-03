package paymentProcessor;

public class PaymentProcessor {

  private IPaymentMethod iProcessPayment;

  public PaymentProcessor(IPaymentMethod iProcessPayment) {
    this.iProcessPayment = iProcessPayment;
  }

  public void processPayment(){
    iProcessPayment.processPayment();
  }

}
