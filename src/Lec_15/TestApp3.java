package Lec_15;
import java.util.Random;
import java.util.Scanner;
public class TestApp3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
//      int nums[][] = new int[3][4];

        System.out.println("Enter the number of students? ");
        int n = scanner.nextInt();

        int nums[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            int subjectsCount = random.nextInt(10) + 1;
            nums[i] = new int[subjectsCount];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(100) + 1;
            }
        }

        for(int[] student : nums){
            for(int marks : student){
                System.out.print(marks + " | ");
            }
            System.out.println();
        }
    }

    public static void modifyElement(int element) {
        element *= 2;
    }

    public static void modifyArray(int[] array2) {
        for (int i = 0; i < array2.length; i++)
            array2[i] *= 2;
    }

}
