package LabAssignment_2;

public class BasePlusCommisionEmployee extends CommisionEmployeee{
    private double baseSalary;
    //------------------------------------------------- CONSTRUCTORS ---------------------------------------------------
    public BasePlusCommisionEmployee(String firstName, String lastName, String ssn,double sales, double rate,double salary) {
        super(firstName, lastName, ssn,sales,rate);
        setBaseSalary (salary);
    }
    //------------------------------------------------- GETTERS AND SETTERS ---------------------------------------------------

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) {
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
    }


    public  double earning () {
        return getcommissionRate() * getGrossSales();
    }

    public String toString()
    {
        return String.format("**********************************************************************************\n" +
                        "\n%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
