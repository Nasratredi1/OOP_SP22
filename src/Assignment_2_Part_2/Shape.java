package Assignment_2_Part_2;

public class Shape {
    public enum  color {Red, Orange, yellow, Blue};
    private  color shapeColor;
    private boolean isFilled;
    //------------------------------------------------- CONSTRUCTORS ---------------------------------------------------


    public Shape(color shapeColor, boolean isFilled) {
        this.shapeColor = shapeColor;
        this.isFilled = isFilled;
    }

    //------------------------------------------------- GETTERS AND SETTERS ---------------------------------------------------

    public color getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(color shapeColor) {
        this.shapeColor = shapeColor;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public double setFilled(boolean filled) {
        isFilled = filled;
        return 0;
    }

    public double getArea() {
        return 0;
    }
    public double getParameter(){
        return 0;
    }

}

