package Lecture_19_Abstraction.Lec_19_Abstracttion_2;

public  class CommissionEmployee extends Employee {
    private double commissionRate;
    private double totalSales;

    public CommissionEmployee(int id, String name, double commissionRate, double totalSales) {
        super(id, name);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }

    public CommissionEmployee() {
    }


    @Override
    public double getEarnings(){
        return getCommissionRate() * getTotalSales();
    }

    @Override
    public String toString(){
        return "CommissionEmployee { " +
                "commissionRate = " + commissionRate + ", " +
                "totalSales = " + totalSales + "}";
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

}
