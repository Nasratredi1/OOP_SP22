package Lec_11;
/*
// Lec_11 Composition
Deff: we build classes assembling  together other classes this is called

 */
public class  Employee_Test_APP {
    public static void main(String[] args) {
        Address postalAddress = new Address("House No. 109 Block A ","Jublie Town","Lahore");
        // we can pass postalAddress b/c we declared already that.
        Employee emp1 = new Employee(1, "Ahmad",postalAddress);

        emp1.display();

        System.out.println(emp1.getPostalAddress().city);
        test(emp1); // refrence locate in emp1

    }

    public static void test (Employee emp){
        // if we want to change the value
        emp.getPostalAddress().town = "Model Town";
        System.out.println(emp.getPostalAddress().town); // if town was private then we write gettown
    }
}

/*
if we have three instance variable like
String streetAddress;
String town;
String city;

if we have multiple classes and we need this to use in all classes so there is ambeguity chances.
for this we make indivtual class and write that attribute .

if some times later we need a country to add in address class for this we only need to add in
address class there is no need in other classes.

###########Compostition

Composition is reffered as has-a relationship.
for ex: we can compose Car class with Engine as instance variable: Car has-a Engine.

Mostly we make getter and setters of private attribute.

# Mostly we are not write all attributes in constructor.

IMP: int is a premetive type and string is a reference type.

Employee is a reference type.

iska mafhoom samajny ke leye u samjy.

// if we encapsualte or private some instance variable then we can access
through get. if we are not then we can access object name then add then. variable name
 */
