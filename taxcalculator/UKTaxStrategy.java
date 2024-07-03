package taxcalculator;

public class UKTaxStrategy implements ITaxStrategy {

  @Override
  public double calculateTax() {
    return 0.2;
  }

}
