package Jair;

import java.util.Arrays;
import java.util.Scanner;

public class Replit140 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        //TODO: Write your code below
        String[] result = new String[words.length];
        /*for (int i = 0; i < result.length; i++) {
            for (String each : words) {
                result[i] = "" + each.charAt(0) + each.charAt(each.length() - 1);

            }
        }*/
        int i = 0;
        for (String each : words) {
            result[i] = "" + each.charAt(0) + each.charAt(each.length() - 1);
            i++;

        }

        System.out.println(Arrays.toString(result));


    }
}
