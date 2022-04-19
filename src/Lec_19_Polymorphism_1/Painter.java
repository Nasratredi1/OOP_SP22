package Lec_19_Polymorphism_1;

public class Painter {
    int id;
    String name;

    final static int RATE = 200;

    /* if we see it there is redundancy of code which is used multiple time.
     so for this purpose we only used parent type
     so if we summarize it: if some method which used generic things like shape not specific
     like Rectangel agr wo generic type use karta han up apna kam karsakta han
     to waha pr specific chez use nahi karna.
     */

    public double estimatePaintingCost(Shape shape) {
        return shape.calculateArea() * RATE;

    }

//    public double estimatePaintingCost(Rectangle rectangle) {
//        return rectangle.calculateArea() * RATE;
//
//    }
//
//    public double estimatePaintingCost(Circle circle) {
//        return circle.calculateArea() * RATE;
//    }
//
//    public double estimatePaintingCost(Square square) {
//        return square.calculateArea() * RATE;


}

