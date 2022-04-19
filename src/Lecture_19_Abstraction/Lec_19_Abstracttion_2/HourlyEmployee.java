package Lecture_19_Abstraction.Lec_19_Abstracttion_2;

public class HourlyEmployee extends Employee {
    private double hours;
    private double ratePerHour;

    public HourlyEmployee(int id, String name, double hours, double ratePerHour) {
        super(id, name);
        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double getEarnings() {
        return getHours() * getRatePerHour();
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
}
