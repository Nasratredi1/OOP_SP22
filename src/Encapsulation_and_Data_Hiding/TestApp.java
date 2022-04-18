package Encapsulation_and_Data_Hiding;

// Lecture No 7: Encapsulation and Data Hiding.
/*
Real life example of Private Behaviour or state
Kitchen, Bedroom do not allow strangers to come.
Mobile number we do not share with each other.
Cnic

Object may also be private. like eat
 */
public class TestApp {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks1 = 75;
        s1.marks2 = 85;
// Encapsulation if we not encapsulate then might be possible to change it like that
        // for this we write in object class private with this variable
        // can't store this value but 10 is valid they can store it.
        s1.setId(10);
        System.out.println(s1.getId());

//        boolean result = s1.isPass();
//        System.out.println(result);
//        s1.test();

        // can't access the private instance varible.
        //System.out.println(s1.MobileNumber);


    }
}
