import taxes.TaxSystem;
import taxes.IncomeTaxSystem;
import taxes.ProfitTaxSystem;

public class Main {
    public static void main(String[] args) {
        taxes.TaxSystem incomeTax = new taxes.IncomeTaxSystem();
        taxes.TaxSystem profitTax = new taxes.ProfitTaxSystem();

        Company company1 = new Company("ААА ", incomeTax);
        company1.shiftMoney(10000);
        company1.shiftMoney(-3000);
        company1.payTaxes();

        Company company2 = new Company("ООО ", profitTax);
        company2.shiftMoney(10000);
        company2.shiftMoney(-5000);
        company2.payTaxes();
    }
}