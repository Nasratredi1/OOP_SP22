package Lec_15;

import java.util.Random;
import java.util.Scanner;

public class TestApp3My {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        // passing arrays to Methods
//        int [] nums = {1, 2 , 3};
//       // modifyElement(nums[2]);
//        modifyArray(nums);
//        System.out.println(nums[2]);

        // Regular shape two dimensional array
      /*  Random random = new Random();
        int nums [][] = new int [3][4]; // 3 rows and 4 columns first rows then columns

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = random.nextInt(100) + 1;

            }
        }
        // for printing
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(nums[i][j] + " ");
            }
            System.out.println();
        }

       */

        // irregular shape two dimen array
        System.out.println("Enter the number of Students? "); // Dynamically takes input
        int n = input.nextInt();
        int nums[][] = new int[n][];
        for (int i = 0; i < n ; i++) {
            int subjectCount = random.nextInt(10) + 1;
            nums[i] = new int[subjectCount];
        }
       // nums[0] = new int[3];
//        nums[1] = new int[4];
//        nums[2] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(100) + 1;

            }
        }
        // for printing
        /*
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j] + " ");
            }
            System.out.println();
        }

         */
        // printing through inhanced for loop
        for (int[] student : nums){
            for (int marks : student){
                System.out.println(marks + " |");
            }
            System.out.println();
        }

        // you can make an irregular shape array like this.
/*
        int nums2[][] = new int [][]{
                {2,4,5,7},
                {3,5,7,4,60}
                // regular shape of array
                {2,4,5,7},
                {3,5,7,4}
        };

 */
    }

    public static void modifyElement(int element) {
        element *= 2;
    }

    public static void modifyArray(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] *= 2;

        }
    }
}
