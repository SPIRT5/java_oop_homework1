package taxes;

public class IncomeTaxSystem extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        return Math.max((int) (debit * 0.06), 0);
    }
}