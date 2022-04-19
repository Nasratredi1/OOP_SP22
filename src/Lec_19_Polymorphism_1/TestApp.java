package Lec_19_Polymorphism_1;

public class TestApp {
    public static void main(String[] args) {
        Shape shape = new Rectangle(2,3);

        System.out.println(shape.calculateArea());

    }

}

/*
Shape s = new Rectangle();
Reference is a parent type.
Object is a child type
Parent class can take own object and also child object as well.

Method overriding : at runtime we decide
which method is executed.
Child class method is executed. if child class override it.
 parent class method is not executed.

 */
