package Lec_18_Inheritance2;

public class TestApp {
    public static void main(String[] args) {

        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                1,"Nasrat",0.03,300000,50000);

        System.out.println(employee.getEarnings());// child class method run b/c we override it otherwise parent class called

    }
}

/*
Method Overriding
Defining an inherited method in child class, is called method overriding.

There are two cases, how we override a method.

1) We implement method in child class that make use of parent class
method too along with adding new behavior.

2) We give completely new difinition by redefining same method in child class
that do not make use of parent class method.

Method overriding have two benifits:
1) Code reusability.
2) Polymorphism.

in overriding method name and paramater must be matched.

If you want to call parent class then you must used super keyword.
 */
