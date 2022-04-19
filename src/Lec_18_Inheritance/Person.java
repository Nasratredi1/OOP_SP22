package Lec_18_Inheritance;

public class Person {
    private int id;
     private String name;

    public Person(int id, String name) {
        this.id = id;
        setName(name);
    }
   protected void setId(int id){
        if (id > 0)
        this.id = id;
   }
    protected int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
        System.out.println("no-arg constructor called of person.");
    }

    public void m1 (){
         System.out.println("m1 called in person class");
     }
}
