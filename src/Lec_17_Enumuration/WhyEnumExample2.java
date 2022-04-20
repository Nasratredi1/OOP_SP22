package Lec_17_Enumuration;

public class WhyEnumExample2 {
    public static void main(String[] args) {
        String gender = getGender();

        if(gender.equals("Male"))
            System.out.println("Gender = Male");

        else if(gender.equals("Female"))
            System.out.println("Gender = Female");
    }

    // Below method is expected to return correct value of gender
    public static String getGender(){
        String gender = "Maleoi"; // Get input from user or read data from file etc.
        return gender;
    }
}
