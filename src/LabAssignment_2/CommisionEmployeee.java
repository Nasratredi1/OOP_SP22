package LabAssignment_2;

public class CommisionEmployeee extends Employee{
    private double grossSales;  // gross weekly sales
    private double commissionRate; // commission percentage.
    private double bonus;
    //------------------------------------------------- CONSTRUCTORS ---------------------------------------------------
    public CommisionEmployeee(String firstName, String lastName, String ssn,double sales,double rate) {
        super(firstName, lastName, ssn);
        setGrossSales( sales );
        setCommissionRate( rate );
        if (this.commissionRate >= 10000 && this.commissionRate <= 20000){
            this.bonus = 5000;
        } else if (this.commissionRate >= 20000 && this.commissionRate <= 50000){
            this.bonus = 10000;
        }else if (this.commissionRate >= 50000){
            this.bonus = 20000;
        }
    }
    //------------------------------------------------- GETTERS AND SETTERS ---------------------------------------------------
    public double setCommissionRate(double commissionRate )
    {
        this.commissionRate = commissionRate;
        if (this.commissionRate >= 10000 && this.commissionRate <= 20000){
            this.bonus = 5000;
        } else if (this.commissionRate >= 20000 && this.commissionRate <= 50000){
            this.bonus = 10000;
        }else if (this.commissionRate >= 50000){
            this.bonus = 20000;
    }
        return  this.bonus;

    }
    public double getcommissionRate(){
        return commissionRate;
    }
    public void setGrossSales(double Sales) {
         grossSales = (Sales < 0.0) ? 0.0: Sales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public  double earning () {
        return getcommissionRate() * getGrossSales();
    }

    @Override
        public String toString()
        {
            return String.format(
                            "%s: %s\n%s: $%,.2f; %s: %.2f",
                    "commission employee", super.toString(),
                    "gross sales", getGrossSales(),
                    "commission rate", getcommissionRate());
        }
    }

