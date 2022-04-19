package Lecture_19_Polymorphism_2;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double basicSalary;

    public BasePlusCommissionEmployee(int id, String name,
                                      double commissionRate,
                                      double totalSales,
                                      double basicSalary) {
        super(id, name, commissionRate, totalSales);
        setBasicSalary(basicSalary);
    }

    public BasePlusCommissionEmployee() {
    }

    @Override
    public double getEarnings() {
        double totalEarning = getBasicSalary() + super.getEarnings();
        return totalEarning;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}
