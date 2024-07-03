package taxcalculator;

public class TaxCalculator {

  private ITaxStrategy taxStrategy;

  public TaxCalculator(ITaxStrategy taxStrategy){
    this.taxStrategy = taxStrategy;
  }

  public double calculateTax(){
    return taxStrategy.calculateTax();
  }
}
