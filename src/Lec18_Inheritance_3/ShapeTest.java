package Lec18_Inheritance_3;

import Lec_10.Calculator;

public class ShapeTest {
    public static void main(String[] args) {

        //Rectangle rectangle = new Rectangle(1,2,3);
        // we can make a reference of that b/c inheritance is a IS-A Relationship.
//        Shape shape = new Rectangle(1,2,3);
//        printInfo(shape);
        // Or
        //printInfo(new Rectangle(1,2,3));

//        Rectangle r1 = new Rectangle(1,2,3);
//        Shape s1  = new Rectangle(1,2,3);
//        Circle c1 = new Circle(2,5);
//        Circle c2 = new Circle(2, 5);
//
//        printInfo(r1,s1,c1,c2);

        Rectangle rectangle = new Rectangle(1,2,3);
        System.out.println(rectangle.toString());


    }
    // instanceof usage: check that our parent type kis ko point kar rahy han

//    public static void printInfo (Shape shape){
//        if (shape instanceof  Rectangle){
//            System.out.println("Pointing to rectangle object");
//        }else if (shape instanceof Circle){
//            System.out.println("Pointing to circle object");
//        }
//    }

    // or
    public static void printInfo(Shape... shapes) {
        int rectangleCounter = 0;
        int circleCounter = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                rectangleCounter++;
            } else if (shape instanceof Circle) {
                circleCounter++;
            }
        }
        System.out.println("Circle = " + circleCounter);
        System.out.println("Rectangle = " + rectangleCounter);
    }

}





    /*
    # 18.6 Reference Type and Object Type
    Parent type variable can store the reference of it

    for ex: we can store reference of Rectangel object in shape type variable
    As, Rectangle IS-A Shape.

    InstanceOf Operator:
    InstanceOf operator can be used to check the actual type
     of objects a reference variable points to.

     # Now Shape variable point to rectangel they can point to squere or Circle
     1 Specific time mein kis chez ko piont kar raha han. and what is the type of that
     for this we used instance of operator.

     18.7: Object and tostring method
     * The super class of all classes in Java is Object class
     * Our classes are always subclass of Object, so we generally omit to inherit from Object, as its done
     implicitly.

     Some methods of Object class we must know..
     * tostring
     * finalize
     * equals.

     Tostring method is automatically called when we make an object
     and pass that object.
     */

