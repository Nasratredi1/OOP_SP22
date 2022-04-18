package Encapsulation_and_Data_Hiding;

public class Student {
   // Data hiding or encapsulation
    private int id;
    String name;
    double marks1;
    double marks2;
    private String MobileNumber;

    public void setId (int num) {
        if (num > 0)
            id = num;
        else
            System.out.println("Invalid id passed");
    }

    public int getId (){
        return id;
    }
// you can't call to this method in other class
//   private double calculateAverage(){
//        double sum = marks1 + marks2;
//        return sum / 2.0;
//    }

//    public boolean isPass() {
//       if (calculateAverage() >= 50)
//           return true;
//       else
//           return  false;

//       boolean result = calculateAverage() >= 50;
//       return result;
    }

//    public void test (){
//        System.out.println(MobileNumber);
//    }
//}

// if we not write the access modifier then the access of this is by default


/*
// if we define id as an instance varible also and want to pass as an local variable also
they give preference to loacal they assume this is local variable.

for defrentiation we used this keyword.
public void setId(int id) {
if (id > 0)
id = id;
//
this.id = id;

// this is a referenced to current object.



 */