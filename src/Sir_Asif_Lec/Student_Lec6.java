package Sir_Asif_Lec;

public class Student_Lec6 {
    // instance varible
    int id;
    String name;
    double marks1;
    double marks2;

    // perform some activity for this we declare methods.
    // if you do anything that must be within that class.

    double calculateAverage(){
        double sum = marks1 + marks2;
        return sum / 2.0;
    }

}

// that is not a good approach that you pass value as an argument.
/*
    double calculateAverage(double m1, double m2){
        double sum = m1 + m2;
        return sum / 2.0;

 */


