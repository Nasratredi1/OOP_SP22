package Lec_17_Enumuration;

public enum Cities {

    LAHORE(100, 20),
    KARACHI(150, 25),
    ISLAMABAD (30, 5);

    private double population;
    private double area;

    Cities(double population, double area) {
        this.population = population;
        this.area = area;
    }

    public double getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }
}
