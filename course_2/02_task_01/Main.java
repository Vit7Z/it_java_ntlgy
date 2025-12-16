
import taxes.Tax15;
import taxes.Tax6;

public class Main {
  public static void main(String[] args) {
    Company company = new Company("Трест", new Tax6());

    company.shiftMoney( 400);
    company.shiftMoney( -300);
    company.shiftMoney( 600);
    company.payTaxes();

    company.setTaxSystem(new Tax15());
    company.shiftMoney( 400);
    company.shiftMoney( -300);
    company.shiftMoney( 600);
    company.payTaxes();
  }
}