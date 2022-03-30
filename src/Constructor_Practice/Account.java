package Constructor_Practice;

import java.sql.SQLOutput;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account (String number, double balance, String customerName, String customerEmailAddress,String customerPhoneNumber){
        System.out.println("Customer of Account with paramater called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(){
        // calling from one constructor to another by using this keyword.
        this("3456",500,"John redi","johnredi@gmail.com","0345 43 4 54 54");
        System.out.println("Empty Constructoe is called");
    }
    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount+"made. New balance is "+ this.balance);

    }
    public void withdrawal (double withdrawAmount){
        if (this.balance - withdrawAmount <= 0){
            System.out.println("only"+this.balance+ "available. withdrawal not proceed");
        }else {
            this.balance -= withdrawAmount;
            System.out.println("withdrawal of "+withdrawAmount+"processed. Remaining balance = "+this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
