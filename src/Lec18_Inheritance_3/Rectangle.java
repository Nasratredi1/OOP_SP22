package Lec18_Inheritance_3;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(int id, double length, double width) {
        super(id);
        setLength(length);
        setWidth(width);
    }

//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }


    @Override
    public double calculateArea() {
        System.out.println("Rectangle.calculatedArea called.");
        return getLength() * getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}' +super.toString();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}


