package Jair;

public class Replit115 {
    public static void main(String[] args) {
        int[] nums = {2, 4, 2, 3, -2};
        int max = nums[0];

        for (int each : nums
        ) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println(max);

    }
}
