package Lecture_19_Abstraction.Lec_19_Abstracttion_1;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public double calculateArea() {
        System.out.println("Circle.calculateArea called. ");
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
