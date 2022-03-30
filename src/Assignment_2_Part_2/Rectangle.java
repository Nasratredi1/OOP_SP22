package Assignment_2_Part_2;

public class Rectangle extends Shape{
    //---------------instance varible------
    private double length;
    private double width;

    //------------------------------------------------- CONSTRUCTORS ---------------------------------------------------
    public Rectangle(color shapeColor, boolean isFilled, int length, int width) {
        super(shapeColor, isFilled);
        this.width = width;
        this.length = length;
    }

    //------------------------------------------------- GETTERS AND SETTERS ---------------------------------------------------

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

    @Override
    public double getParameter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
