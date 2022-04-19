package Lecture_19_Polymorphism_2;

public class Employee {
    private int id;
    private String name;
    private int bankAccountNumber;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee() {
    }

    public double getEarnings(){
        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
}
