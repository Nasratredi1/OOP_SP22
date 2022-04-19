package Lecture_19_Abstraction.Lec_19_Abstracttion_1;
// Final class can't be extended it.ex : string is a final class.
// final method can't be overriden by subclasses.
// private and static methods are implicitly final.
// if we want to must define method by child class than on that time
// we used abstract method.
public class TestApp {
    public static void main(String[] args) {
//        Shape shape = new Rectangle(2,3);
//
//        System.out.println(shape.calculateArea());
        // we can't make an object of abstract class
        //Shape shape = new Shape() ;
        // we can reference it to it's child.
        Shape shape = new Circle(10);

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
