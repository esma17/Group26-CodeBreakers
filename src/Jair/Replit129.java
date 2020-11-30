package Jair;

import java.util.Arrays;

public class Replit129 {
    public static void main(String[] args) {
        String[] numbers = {"zero", "one", "two", "three", "four"};
        String result = "";


        for (String each : numbers
        ) {
            if (each.contains("e")) {
                result += each + " ";

            }
        }
        String[] fewValues = result.trim().split(" ");

    }
}
