package Sir_Asif_Lec;

public class Rectangle {
    double length;
    double width;

    double calculateArea (){
        double area = length * width;
        return  area;

    }

    double calculatePerimeter () {
//        double perimeter = 2 * (length + width);
//        return perimeter;
        // you return like this also.
        return 2 * (length + width);
    }
}

/*
Person lec 5
package Sir_Asif_Lec;

public class Person_Lec5 {
    int id;
    String name;
    int age;
    String email;
    String address;
    String mobile;
}

 */


 //TestApp Lec 5
/*
package Sir_Asif_Lec;
// lec No: 5
public class TestApp_5 {
    public static void main (String args[]){
        int a = 20;

        // p1 store the reference
        Person_Lec5 p1 = new Person_Lec5();

        p1.id = 1;
        p1.name = "Nasrat";
        p1.age = 22;
        p1.mobile = "03433435";

        Person_Lec5 p2 = new Person_Lec5();
        p2.id = 2;

        printData(p1);

    }

    public static void printData (Person_Lec5 p){
        System.out.println(p.id);
        System.out.println(p.name);
        System.out.println(p.age);
    }


}


/*

To remove this ambiguity we need to declare class
 // for One object we need more attribute like person
        int personId;
        String name;
        int age;
        String email;

        // for book
        int bookId;
        String title;
        int year;

        LEC no: 6
        Real life object also have behaviour
        they perform some activity.
        like student :  course register, task performed, take class

        Behaviour mean: object perform some action or activity.
 */


