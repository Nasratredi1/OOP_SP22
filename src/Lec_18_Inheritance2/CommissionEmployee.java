package Lec_18_Inheritance2;

public class CommissionEmployee {
    // attributes, faileds, instance variable
    private int id;
    private String name;
    private double commissionRate;
    private double totalSales;

    public CommissionEmployee(int id, String name, double commissionRate, double totalSales) {
        this.id = id;
        this.name = name;
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }
    public CommissionEmployee(){

    }
    // earning method
    public double getEarnings(){
        return getCommissionRate() * getTotalSales();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
