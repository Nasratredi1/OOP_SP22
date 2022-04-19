package Lec_19_Polymorphism_1;

public class Triangle extends Shape{
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return .5 * base * height;
    }
}
