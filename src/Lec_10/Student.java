package Lec_10;

import java.util.SplittableRandom;

public class Student {
    private int id;
    private String name;
    static String university;
    static int counter;
// static block is also executed before constructor.
    static {
        counter = 10;
        System.out.println("Static block called");
    }

    // Static block execute automatically when the class is loaded in memory.



//    public Student(int id, String name){
//        this.id = id;
//        this.name = name;
//
//    }

    public Student (String name){
        System.out.println("constructor called");
        this.id = ++counter;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name ){
        this.name = name;
    }
    public void display (){
        System.out.println(id);
        System.out.println(name);
    }
    static void testStatic(){
        System.out.println("testStatic .. "+university);
        //System.out.println(id);// we can't access to instance variable
        printCounter();
    }

    static void printCounter(){
        System.out.println("counter = " + counter);
    }
}

/*
we can't access non static method in a static method.
 */
