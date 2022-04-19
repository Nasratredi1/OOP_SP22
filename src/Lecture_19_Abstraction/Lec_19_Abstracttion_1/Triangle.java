package Lecture_19_Abstraction.Lec_19_Abstracttion_1;

public class Triangle extends Shape {
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
