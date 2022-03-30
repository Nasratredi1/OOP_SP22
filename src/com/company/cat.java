package com.company;
/*Instance variable
 Every instance has it's own copy of an instance variable
 Every instance can have a different value (state)
 instance variable represents the state of an instance

 */

public class cat {
     String name = "Ahmad";
    public cat (String name)
    {
        this.name = name; // you can't write cat.name = name;
    }
    public void printName()
    {
        System.out.println("name= " +name);
    }
     //Instance method
    //static variable
//   private static String name = "ahmad";
//   // instance method
//    public void bark()
//    {
//        System.out.println("Green bark");
//        System.out.println("the name is = "+ name);
//    }
}
