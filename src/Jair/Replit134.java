package Jair;

import java.util.Arrays;
import java.util.Scanner;

public class Replit134 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for (int i = 0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for (int j = 0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE
        boolean result = true;
       /* for (int i = 0; i < outer.length; i++) {
            for (int j = 0; j < inner.length; j++) {
                if (outer[i] == inner[j])
                    result = false;
            }


        }*/
        String num1= "";
        String num2= "";

        for (int each:inner
             ) {num1+=each;

        }
        for (int each1:outer
             ) {num2+=each1;

        }

        System.out.println(num1.contains(num2));

    }
}