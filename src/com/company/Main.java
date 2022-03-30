package com.company;

//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world");
//        int myFirstNumber = (10 + 5) + (2 * 10);
//        int mySecondNumber = 2;
//        int myThirdNumber = myFirstNumber * 2;
//        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
//        System.out.println("TOTAL = " + myTotal);

//          int myIntValue = 5 / 2 ;
//          float myFloatValue = 5f / 2f;
//          double myDoubleValue = 5d / 2d;
//          char myChar = 'A';
//          boolean isMale = true;
//          String myString = "This is my String\n";
//          myString = myString + "This is more my string character";
//
//          System.out.println("myIntValue = "+ myIntValue);
//          System.out.println("myFloatValue = "+ myFloatValue);
//          System.out.println("myDoubleValue = "+ myDoubleValue);
//          System.out.println("myCharValue = "+ myChar);
//          System.out.println("MyBooleanValue = " + isMale);
//          System.out.println("My string value is = "+ myString);




        //  write a program
        // Convert a given number of pounds to kilograms.

//        double numPounds = 200d;
//        double convertedKilograms = numPounds * 0.45359237d;
//        System.out.println("Kilograms = " + convertedKilograms);


        // OPERATOR IN JAVA
//        int result = 1 + 2;
//        System.out.println("1 + 2 = " + result);
//
//       int previousResult =  result;
//       result = result - 1;
//        System.out.println(previousResult + " - 1  = " + result);
//
//        previousResult = result;
//
//        result = result * 10;
//        System.out.println(previousResult + " * 10 = " + result);
//
//        result = result / 10;
//        System.out.println(previousResult + " / 10 = " + result);
//
//        result ++ ;
//        System.out.println("Result is now " + result);
//
//        result -- ;
//        System.out.println("Result is now " + result);
//
//        result += 2 ;
//        System.out.println("Result is now " + result);
//
//        result *= 10 ;
//        System.out.println("Result is now " + result);


        // condition  in java

//        boolean isAhmad = false ;
//
//        if (isAhmad == true)
//            System.out.println("It is not an Ahmad");
//
//        //int topScore = 90;
//        //taking input from the user  // for this if you write in Note book you must import this below package.
//        // import java.utill.*;
//        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
//        System.out.println("Enter the number of the student: ");
//        int topScore = sc.nextInt();

        // if you want to take a string from a user  and want to save it in a varibale you can do like this

       // String str = sc.nextLine();


//        if (topScore == 100)
//            System.out.println("You got the high Score! Congratulation ");
//
//        if (topScore != 100)
//            System.out.println("You came in A categore but not a best category");
//
//        if (topScore >= 100)
//            System.out.println("You got the best score in all college!");
//
//        if (topScore <= 100)
//            System.out.println("Your school is average Pls don't be confused !");
//
//        System.out.println("Enter a second top score: ");
//        int secondTopScore = sc.nextInt();
//
//        if ((topScore >secondTopScore) && (topScore < 100))
//            System.out.println("Greater than top score and less than 100");



                // instance of House class.
//                House blueHouse = new House("blue");
//                // creates another reference to the same object in memor
//                House anotherHouse = blueHouse;
//
//                System.out.println(blueHouse.getColor()); // blue
//                System.out.println(anotherHouse.getColor());// blue
//
//                anotherHouse.setColor("red");
//                System.out.println(blueHouse.getColor());// red
//                System.out.println(anotherHouse.getColor());// red
//
//                House greenHouse = new House("green");
//                anotherHouse = greenHouse;
//
//                System.out.println(blueHouse.getColor()); // red
//                System.out.println(greenHouse.getColor()); //green
//                System.out.println(anotherHouse.getColor());//geen
//
//                 House yellowHouse = new House("Yellow");
//                 anotherHouse = yellowHouse;
//
//               System.out.println(greenHouse.getColor());
//               System.out.println(yellowHouse.getColor());

               // Object for instance variable and cat class
                // Instance variable are created when an object is created
                // with the use of the keyword 'new' and destroyed when the object is destroyed.

//                cat Billy = new cat("Billy");// create instance (Billy)
//                cat Pesho = new cat("Pesho");// create instance (Pesho)
//
//                Billy.printName();// Billy
//                Pesho.printName();// Pesho



//                Object variable for static variable and Dog class
//                Dog GullTer = new Dog("GullTer"); //create instance (Gullter)
//                Dog GullDong = new Dog("GullDong");// Create instance (GullDong)
//
//                GullTer.printName();
//                GullDong.printName();

        //System.out.println("Name of the variable "+ Dog.name);



        // Instance and static method

        // instance method  belong to instance of a class
        // for this you must instantiate class by using new keyword
        // instance variable can access instance method and instance variable directly.
        // can also access static method and static varibale directly
//
//        cat cat1 = new cat();// create an instance
//        cat1.bark();  // call to instance method


        // static method ( You don't need to crate an instance for you can access by classname.variableName
        Dog.PrintSum(5,15);
        printHello();
       Dog.DogName();
    }
    public static void printHello()
    {
        System.out.println("Hello");
    }
}
