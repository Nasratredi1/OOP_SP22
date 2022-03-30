import java.util.Scanner;
public class WrapperDemo
{
public static void main(String[] args)
{
Scanner arslan = new Scanner(System.in);
int c;
int d;
int e;
System.out.println("please enter the value of c,d and e");
c=arslan.nextInt();
d=arslan.nextInt();
e=arslan.nextInt();
System.out.println("please enter the value of x you want to wrap");
Integer x = new Integer(arslan.nextInt());
Integer y = new Integer(d);
Integer z = new Integer(e);
System.out.println("x is "+x);
System.out.println("y is "+y);
System.out.println("z is "+z);
System.out.println("please enter the value of b you want to wrap");
int b = arslan.nextInt();
Integer a = new Integer(b);
System.out.println("a is "+a);
}
}