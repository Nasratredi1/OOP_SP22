package Lec_10;

// static variable, Method and Blocks
public class TestAppDemo {
    public static void main(String[] args) {
//    Student std1 = new Student(1, "Abid");
//    Student std2 = new Student(2,"Zahid");
        Student std1 = new Student("abid");

        System.out.println(Student.counter);

//    Student.university = "Comsats";
//    std1.university = "FAST";
//    std1.display();
//        System.out.println(Student.university);

        // in all three cases we get updated value which we change it.
//        System.out.println(std2.university);
//        System.out.println(Student.university);
//        System.out.println(std1.university);

        // calculator class
//        System.out.println(Calculator.sum(2,4));
//        Student.testStatic();

    }

}

/*
Those attributes which values for all objects is same. for this we are not make instance variable
we make static variable.
non static : every object have own individuals
Instance variable : save in every instance or object.
static variable is not an individuals they are in a common place. which all object can access , and they are shared.
In a class level all static variable is stored. and variable is shared between all objects
Data of this variable for all objects is same. for this we don't need to create an objects.

static variabale is an a class level. they are not in object level. when class is lood. they also load.

############### Static Methods  #########
Static method also is an class level. for this we don't need to create an instance.
 */
