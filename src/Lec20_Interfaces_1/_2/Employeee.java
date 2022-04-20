package Lec20_Interfaces_1._2;

import Lec20_Interfaces_1.Walkable;

// if they implement any interface they must override that class methods.
//you can implements more than one interface like this
// this mean Employee object can save in payable and walkable,
// cannot make object of interface if you override it some methods
public class Employeee implements Payable, Walkable {
    double salary = 1000;

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public void walk() {

    }
}
