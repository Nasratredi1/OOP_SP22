package Lec20_Interfaces_1._2;

public interface Payable {
    double getPaymentAmount();

    // you can declare method in Interface but you must used default keyword before that
    default  void m1(){
        System.out.println("m1 is called...");
    }
}
