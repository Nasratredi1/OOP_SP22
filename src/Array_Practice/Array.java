package Array_Practice;

public class Array {
    public static void main(String[] args) {
        // Array Declarition
        //int [] myIntArray = new int [10];
        // double array declarition
        //double [] myDoubleArray = new double[10];
      // initilization and declarition of array.

       // int [] myIntArray = {1,2,3,4,5,6,7,8,9,10};

        int [] myIntArray = new int [30];
        for (int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);

    }

    public static void printArray(int[] array){
        for (int i=0; i< array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
