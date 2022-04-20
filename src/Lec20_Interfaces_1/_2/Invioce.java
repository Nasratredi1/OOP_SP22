package Lec20_Interfaces_1._2;

public class Invioce implements Payable{
    double qty;
    double unitPrice;

    public Invioce(double qty, double unitPrice) {
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    @Override
    public double getPaymentAmount() {
        return qty * unitPrice;
    }
}
