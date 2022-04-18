package Constructor_Lec8;

import java.util.Random;

public class Person {
int id;
private String name;
int luckyNumber;
// default constructor or no argument constructor. you can write sth in default constructor.
    public Person (){
        Random r = new Random(); // store a reference.
        luckyNumber = r.nextInt(10);


    };

public Person(int id){
    setId(id); // so both are same we can call to setter like this
}
// constructor overloading in one class there exist more than one constructor
public Person (int id, String name){ // you can call another constructor like this.
    this(id);// this class constructor which is have one paramater.
    setName(name);
}

public void setId (int id){
    if (id > 0 )
        this.id = id;
}
public int getId (){
    return  id;
}

public  void setName (String name){
    this.name = name;
}
public String getName(){
    return  name;
}
// Mehod overloading example
    public double sum (int num1, int num2){
    return num1 + num2;
    }
    public double sum (double num1, double num2){
        return num1 + num2;
    }
}

 /*if (id > 0 )
        this.id = id;

     */

