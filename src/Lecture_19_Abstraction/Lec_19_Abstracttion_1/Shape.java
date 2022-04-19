package Lecture_19_Abstraction.Lec_19_Abstracttion_1;

public abstract class Shape {
    int id;
    public abstract double calculateArea();

    // abstract class may have other methods.
    public String getColor(){
        return "Red";
    }



}
