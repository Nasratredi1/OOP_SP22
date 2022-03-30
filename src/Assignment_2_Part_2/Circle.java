package Assignment_2_Part_2;

public class Circle extends  Shape{
    //--------------------instance variable--------------
    private double radius;
    //------------------------------------------------- CONSTRUCTORS ---------------------------------------------------
    public Circle(color shapeColor, boolean isFilled,double radius) {
        super(shapeColor, isFilled);
        this.radius = radius;

    }

    //------------------------------------------------- GETTERS AND SETTERS ---------------------------------------------------\

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public double getParameter() {
        return 2 * Math.PI*radius;
    }
}
