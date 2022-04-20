package Lec20_Interfaces_1._2;

import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {

        Employeee employeee = new Employeee();
        Invioce invioce = new Invioce(10,200);
        // you can do this by using collection
        ArrayList <Payable> payables = new ArrayList<>();
        payables.add(employeee);
        payables.add(invioce);
        sumPayments(payables);

//        sumPayments(employeee);
//        sumPayments(invioce);
    }

//    static void sumPayments (Payable payable){
//        System.out.println(payable.getPaymentAmount());
//    }

    static void sumPayments (ArrayList <Payable> payableArrayList){
        double sum = 0;
        for (Payable payable1: payableArrayList){
            sum += payable1.getPaymentAmount();

        }
        System.out.println("Total Payment Amount: "+sum);
    }


}
/*
All methods and attributes defined in interface are
by default public.
no used of private and protected keyword.
one class can implement multiple interfaces.
 */
