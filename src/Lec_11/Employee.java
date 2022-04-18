package Lec_11;

public class Employee {
    // int and String etc is a jdk already defined type
    private int id;
    private String name;

    // Address is our own define data type  . this is used for less and reusable code
    private Address PostalAddress;

    public  Employee(int id , String name){
        setId(id);// good practice to write like this.
        setName(name);
    }
    // we can make an objects in two ways
    public  Employee(int id , String name, Address postalAddress){
        this(id,name);
        setPostalAddress(postalAddress);
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
    public Address getPostalAddress(){
        return PostalAddress;
    }

    public void setPostalAddress(Address postalAddress){
        this.PostalAddress = postalAddress;
    }

    public void display(){
        System.out.println(getId());
        System.out.println(getName());
    }
}
