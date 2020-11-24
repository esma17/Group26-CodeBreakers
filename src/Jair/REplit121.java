package Jair;

public class REplit121 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};

        int countEvenNumber = 0;
        for (int each : nums
        ) {
            if (each % 2 == 0) {
                countEvenNumber++;
            }
        }
        System.out.println(countEvenNumber);

    }
}
