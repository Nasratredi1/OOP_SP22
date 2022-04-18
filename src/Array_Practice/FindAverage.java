package Array_Practice;

import java.util.Scanner;

public class FindAverage {
   private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int [] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++){
            System.out.println("Element " + i + " Typed values was "+ myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int [] getIntegers(int numbers){
        System.out.println("Enter " + numbers+ "Integer values \n");
        int [] values = new int [numbers];
        for (int i = 0; i < values.length; i++){
            values [i] = sc.nextInt();
        }
        return values;
    }

    public static double getAverage(int [] array)
    {
        int sum = 0;
        for (int i = 0; i< array.length; i++){
            sum += array[i];
        }
        return (double) sum/ (double) array.length;
    }
}


