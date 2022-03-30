package Week5_ArrayLab;

import java.util.Scanner;

public class Array {

    Scanner sc1= new Scanner(System.in);
    private int arr[]= new int[10];
    int i=0;



    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void addValue(){
        for( i=0;i<10;i++){
            System.out.printf("ENTER  element of the array:  ");
            arr[i]= sc1.nextInt();
        }
    }

    public int sumArray(){
        int sum=0;
        for(i=0;i<10;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public int maxNum(){
        int max=0;
        max=arr[0];
        for(i=0;i<10;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }

    public int minNum(){
        int min=0;
        min=arr[0];
        for(i=0;i<10;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }

    public int evenCounter(){
        int evencou=0;
        for(i=0;i<10;i++){
            if(arr[i]%2==0)
                evencou++;
        }
        return evencou;
    }

    public int oddCounter(){
        int oddcou=0;
        for(i=0;i<10;i++){
            if(arr[i]%2!=0)
                oddcou++;
        }
        return oddcou;
    }

    public int numFrequency(int a){
        int counter=0;

        for(int j=0;j<10;j++){
            if(a==arr[j])
                counter++;
        }

        return counter;
    }
}

//    Scanner sc = new Scanner(System.in);
//    //int[] myArray = {43,54,23,65,78,85,88,92,10};
//    int myarr [] = new int[10];
//
//    public int[] getMyarr() {
//        return myarr;
//    }
//
//    public void setMyarr(int[] myarr) {
//        this.myarr = myarr;
//    }
//
//    public void addValue(int a){
//        for (int i =0; i <= 10; i++ )
//        {
//            System.out.println("Enter the 10 ball");
//            a = sc.nextInt();
//        }
//
//    }
//
//    public int find_max(int []myArray) {
//        int max_value= 0;
//    for (int i = 0; i<myarr.length; i++){
//        if (myarr[i] > max_value){
//            max_value = myarr[i];
//        }
//    }
//    return max_value;
//    }
//
//    public  int find_min (int []myarr)
//        int min_value= 0;
//    for (int i = 0; i<myarr.length; i++){
//        if (myarr[i] > min_value){
//            min_value = myarr[i];
//        }
//    }
//    return min_value;
//}
