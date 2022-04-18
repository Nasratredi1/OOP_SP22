package Lec_15;

public class TestApp1 {
    public static void main(String[] args) {


        // primitive types...

        // 1. declare
        int nums[];

        // 2. instatiate
        nums = new int[3];
        // method 1 .. nums = new int[]{2, 4, 6};
        // method 2
//        nums[0] = 2;
//        nums[1] = 4;
//        nums[2] = 6;

        // method 3
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
