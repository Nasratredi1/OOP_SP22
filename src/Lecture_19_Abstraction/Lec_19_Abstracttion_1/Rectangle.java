package Lecture_19_Abstraction.Lec_19_Abstracttion_1;

public  class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    @Override
    public double calculateArea() {
        System.out.println("Rectangle.calculateArea called. ");
        return getLength() * getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "} " + super.toString();
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
    }}
