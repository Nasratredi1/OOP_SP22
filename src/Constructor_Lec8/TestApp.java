package Constructor_Lec8;

public class TestApp {
    public static void main(String[] args) {

        Person p1 = new Person(10);
        System.out.println(p1.id);

        // You can not do li
//        Person p1 = new Person();
//        p1 .setId(10);
        // You can change the value later of the constructor
       // p.setId(20);
       // System.out.println(p.getId());
        Person p2 = new Person(22,"Nasrat redi");
        Person p3 = new Person();

        System.out.println(p2.getId());
        System.out.println(p2.getName());

        System.out.println(p2.sum(4, 8));
    }
}


/*
 int n; // it is called declarition
 n = 10;// it is called initilization
 int n = 10;// both is an one place dec and initi


 * If you don't want to change the value of constructor by using setter then make that
 constructor private.

 # Constructor overloading
 when we define multiple constructor inside a class. it's called constructor
 overloading


 # Method Overloading :
 it's not only the constructor that can be overloaded. we can defined
 multiple methods of same name in a class but they must be different by.

 * Number of paramaters.
 * Type of parameter
 * order of parameters.

 The return type of such methods is kept same generall y.

 # if you make  an object and not pass any value then they will give you an error\
 and told that. there is no found defualt constructor found for this you must declare
 a default constructor.

 # if you were not define constructor then compiler make own by default constructor
 otherwise if you define constructor they you have to define default constructor by own.
 */

