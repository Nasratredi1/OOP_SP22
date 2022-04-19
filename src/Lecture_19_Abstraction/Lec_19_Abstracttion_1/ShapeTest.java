package Lecture_19_Abstraction.Lec_19_Abstracttion_1;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,3);
        Circle circle = new Circle(5);
        Square square = new Square(3);
        Triangle triangle = new Triangle(2,3);

        Painter paint = new Painter();

        double cost1 = paint.estimatePaintingCost(rectangle1);
        double cost2 = paint.estimatePaintingCost(circle);
        double cost3 = paint.estimatePaintingCost(square);
        double cost4 = paint.estimatePaintingCost(triangle);

        System.out.println(cost1);
        System.out.println(cost2);
        System.out.println(cost3);
        System.out.println(cost4);
    }

    /*
    If there is no inheritance then there is no concept of
    Dynamic polymorphism

    Polymorphism helps to design system that are very
    extensible
     */
}
