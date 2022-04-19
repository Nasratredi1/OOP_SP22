package Lec18_Inheritance_3;

public class Circle extends Shape{

    private double radius;

    public Circle(int id, double radius) {
        super(id);
        setRadius(radius);
    }

    @Override
    public double calculateArea() {
        System.out.println("Circle.calculateArea called");
        return Math.PI * radius * radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
