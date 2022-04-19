package Lec_18_Inheritance;

public class TestApp {
    public static void main(String[] args) {
       // Student std = new Student(1,"Ali","OOP");
        Student std = new Student(1,"Ahmad","OOP");

//        System.out.println(std.id);
//        System.out.println(std.name);
        System.out.println(std.getCourseName());
       // System.out.println(std.id);// we can't access in test class b/c of protected keyword with method

        std.setId(10);

//        std.m1();
//        std.m2();


    }
}

/*
Inheritance mean : warasat jo hum apny ancestor or abo ur father sy inherit karty han.

Properties mean: attributes or methods.

attributes and both can be inherited.

public property can be inherited and private attribute can never be inherited.

Inheritance is a IS-A Relationship. Student is a Person.
Encapsulation have HAS-A Relationship ex: student has an id.


18.2
// this(id,name) can't inherited you must write super.

* constructor must be called in first line in child class.

* child class must be called to parent class and that must be the first line of the child
class body.

18.3 Inheritance without  Compromising encapsulation
* if data is public in perent class then child class can be changed.
* if it's private then can't change it.

* setter and getter is used for this purpose if our data is encapsulated
or private and want to access and read it then we make getter and setter for this prupost.

* if we want to apply some validation then responsible that class which
this function is declared.  mean getter and setter have this repsonsibility.

18.4 Protected Access modifier.
parent class attribute ko visible karty han in child clas.
but jaha par child class ka object banega waha pr access nahi dega.

for this we protected the method of getter and setter.

* Protected attribute available in child class and also on those which
is in the same packages.

18.5

Defining an inherited method in child class, is called method overiding.
important point of overriding is reusability.
 */
