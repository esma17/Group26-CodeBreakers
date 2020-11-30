package Jair;

import java.util.Arrays;

public class Replit130 {
    public static void main(String[] args) {
        int[] nums = {6, 2, 5, 3};
        int[] result = new int[nums.length];
        result [result.length-1] = nums[0];
        for (int i = 0; i< result.length-1;i++){
            result[i]= nums[i+1];

        }
        System.out.println(Arrays.toString(result));


    }
}
