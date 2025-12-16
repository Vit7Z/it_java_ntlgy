package taxes;

public class Tax15 extends TaxSystem {
  @Override
  public int calcTaxFor(int debit, int credit) {
    int tax = 15 * (debit - credit) / 100;
    return Math.max(0, tax);
  }
}
