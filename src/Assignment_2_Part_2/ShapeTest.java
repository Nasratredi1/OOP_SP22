package Assignment_2_Part_2;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(Shape.color.Red,false,4.5);
        Rectangle rect1 = new Rectangle(Shape.color.Blue,true, 8,9);
        System.out.println("*************************************************************");
        System.out.println("The color of circle : "+" "+circle1.getShapeColor());
        System.out.println("The color of Rectangle : "+" "+rect1.getShapeColor());

        System.out.println("================================================================");


        System.out.println( "is filled of circle:" + "    " + circle1.isFilled() + "     " + "\nradius of circle :" + "    " + circle1.getRadius());
        System.out.println("******************************************************************");
        System.out.println( "is fillled of rectangle :" + "   " + circle1.isFilled()+  "    " + "\nlength of rectangle :" + "    " + rect1.getLength() + "    " + "\nwidth of rectangle :" + "   " + rect1.getWidth());





        System.out.println("Area of circle :" +"   " + circle1.getArea());
        System.out.println("Perimeter of circle :"+"   " + circle1.getParameter());

        System.out.println("Area of rectangle :"+"   "+ rect1.getArea());
        System.out.println("Perimeter of rectangle :"+"   " + rect1.getParameter());

        printEachShapeCount(circle1, circle1, circle1);

        System.out.println("================================================================");

    }

    public static void printEachShapeCount(Shape... shapes) {
        int countCircle = 0;
        int countRectangle = 0;
        for (Shape i : shapes) {
            if (i instanceof Circle) {
                countCircle++;
            }
            if (i instanceof Rectangle) {
                countRectangle++;
            }
        }
        System.out.println("count of circle: " + countCircle);
        System.out.println("count of rectangle: " + countRectangle);
    }


}

