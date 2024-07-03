package taxcalculator;

public class USATaxStrategy implements ITaxStrategy{

  @Override
  public double calculateTax() {
    return 0.1;
  }

}
