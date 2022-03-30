package com.company;
// static (class) variable
public class Dog {
//    private static String name = "Gullter";
//
//    public Dog (String name)
//    {
//        Dog.name = name;   // you can write in both ways
//        //this.name = name;
//    }
//    public void printName ()
//    {
//        System.out.println("name = " +name);
//        System.out.println("Dog name = "+Dog.name);
//    }

    /* STATIC METHOD:
    static method are declared using a stitic modifier
    static mathod can't access instance variable and instance mehtod directrly
    in static method we can't use the this keyword.
     */

    public static void PrintSum ( int a , int b)
    {

        System.out.println("sum "+ ( a + b));
    }

    public static void DogName()
    {
        System.out.println("DogName is = GullTer");
    }

}
