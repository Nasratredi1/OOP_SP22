import java.util.Scanner;
public class CarDemo
{
   public static void main (String [] args)
   {
   Scanner my = new Scanner(System.in);
   String a,b,c,g,h,i;
   String d,e,f;
   System.out.println("please enter the names of the car");
   a=my.nextLine();
   b=my.nextLine();
   c=my.nextLine();
   g=my.nextLine();
   h=my.nextLine();
   i=my.nextLine();
   System.out.println("please enter the engine version");
   d=my.nextLine();
   e=my.nextLine();
      Engine e1 = new Engine (d);
      Car c1 = new Car (a, b, c);
      Engine e2 = new Engine (e);
      Car c2 = new Car (g, h, i);
      System.out.println (c1.getManufacturer () + " " +c1.getMake () + " " +c1.getModel () + " " + e1.getType ());
      System.out.println (c2.getManufacturer () + " " + c2.getMake () + " " + c2.getModel () + " " + e2.getType ());
   }
}