package Lecture_19_Abstraction.Lec_19_Abstracttion_1;
/* METHOD OVERLOAD OR Static Polymorphism if there is an error come
Then we know in compile time.

Dynamic Polymorphism: Method Overriding
                     The decision of which method would be called
                     occur at runtime.

          Top classes is  Generalizaion
          Bottom of clasess is specialization.
* */
public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5, 6));
        System.out.println(calculator.sum(5.0, 65.5));
    }

    double sum(int num1, int num2) {
        System.out.println("int called... ");
        return num1 + num2;
    }

    double sum(double num1, double num2) {
        System.out.println("double called ... ");
        return num1 + num2;
    }

}
