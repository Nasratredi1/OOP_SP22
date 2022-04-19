package Lecture_19_Abstraction.Lec_19_Abstracttion_1;

public class Square extends Shape {
    private double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public double calculateArea() {
        return size * size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
