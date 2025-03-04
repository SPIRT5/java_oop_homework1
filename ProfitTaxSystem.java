package taxes;

public class ProfitTaxSystem extends TaxSystem{
    @Override
public int calcTaxFor(int debit, int credit) {
    return Math.max((int) ((debit - credit) * 0.15), 0);
 }
}