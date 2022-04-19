package Lec18_Inheritance_3;

public class  Shape extends Object {
    private int id;

    public Shape(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double calculateArea() {
        System.out.println("Shape.CalculatedArea called. ");
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "id=" + getId() +
                '}';
    }
}
