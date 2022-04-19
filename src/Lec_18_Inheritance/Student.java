package Lec_18_Inheritance;

// extends keyword is used for inheritance.
// Person is a parent class and Student is a child class
public class Student extends Person {

    private String courseName;

    public Student(int id, String name, String courseName) {
        super(id, name); // this(id,name) can't inherited you must write super.
      //  this.id = 20; // can't do it b/c of protected keyword.
        this.courseName = courseName;
        m1();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    // if you not want to pass parent class attributes then you have to make default constru for that
//    public Student( String courseName) {
//        super();// if you not write this as well they will first called to parent class. then child
//        this.courseName = courseName;
//        System.out.println("One argument constructor of Student class");
//
//    }
//    @Override
//    public boolean equals (Object o){
//        if (o == null)
//            return  false;
//        if (o instanceof Student){
//            Student s = (Student) o;
//            if(this.getId() == s.getId()){ // you can used this.id
//                return true;
//            }
//        }
//        return false;
//    }

    public void m2() {
        System.out.println(getId());
        setId(20);
        //  System.out.println(id);// you can't read it b/c it's private
        // setId(20);
        //  System.out.println(getId());// you can access like this.
        m1();
        System.out.println("m2 called in Student:");
    }

}
