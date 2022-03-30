package LabAssignment_2;

public class SalariedEmployee extends Employee{
    private double weeklySalary;
    //------------------------------------------------- CONSTRUCTORS ---------------------------------------------------
    public SalariedEmployee(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn);
        setWeeklySalary(salary);

    }
    //------------------------------------------------- GETTERS AND SETTERS ---------------------------------------------------

    public void setWeeklySalary(double salary) {
        weeklySalary = salary < 0.0? 0.0: salary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public double earnings()
    {
        return  getWeeklySalary();
    }

    public String toString()
    {
        return String.format("**********************************************************************************\n" +
                        "Salaried employee: %s \n %s:  $%,.2f " ,
                super.toString(),"Weekly salary", getWeeklySalary());
    }


}
