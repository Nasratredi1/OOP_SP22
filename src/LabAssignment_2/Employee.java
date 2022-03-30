package LabAssignment_2;

public class Employee {
    private String FirstName;
    private String LastName;
    private String SecurityNumber;

    //------------------------------------------------- CONSTRUCTORS ---------------------------------------------------
    public Employee(String firstName, String lastName, String ssn) {
        FirstName = firstName;
        LastName = lastName;
        SecurityNumber = ssn;
    }

    //------------------------------------------------- GETTERS AND SETTERS ---------------------------------------------------
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getSecurityNumber() {
        return SecurityNumber;
    }

    public void setSecurityNumber(String ssn) {
        SecurityNumber = ssn;
    }

    @Override
    public String toString() {
        return String.format("%s %s\n social security number:  %s",
                getFirstName(), getLastName(), getSecurityNumber());
    }
}

