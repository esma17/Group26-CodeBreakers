package Jair;

public class REplit {
    public static void main(String[] args) {
        int[] inner = {-1, 0, 3, 12};
        int[] outer = {-1, 0, 3, 3, 3, 10, 12};
        int count = 0;
        for (int i = 0; i < outer.length; i++) {
            for (int j = 0; j < inner.length; j++) {

                if (outer[i] == inner[j]) {
                    if (i > 1) {
                        if (outer[i] == outer[i - 1]) {
                            break;
                        }
                    }
                    count++;

                }
            }
        }
        System.out.println(count == inner.length);
    }
}
