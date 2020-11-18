package Jair;

import java.util.Arrays;
import java.util.Scanner;

public class REplit136 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO Type your code below:
        boolean result = false;

        for (int i = 0, j = 1; j < nums.length; i++, j++) {
            if (nums[i] == nums[j] && nums[i] == 5) {
                result = true;
            }

        }
        System.out.println(result);

        String result1 = "";
        for (int each : nums
        ) {
            result1 += each;
        }
        System.out.println(result1.contains("55"));



    }
}
