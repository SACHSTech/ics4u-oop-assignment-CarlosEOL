public class Checkout { //just a method that's constantly been used.

  private double TaxRate = 0.15;

  public double GetTaxedTotal (double intTotal){
    return intTotal * TaxRate + intTotal;
  }

  public double getTaxRate() {
    return TaxRate;
  }
}