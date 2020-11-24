package Jair;

public class Replit125 {
    public static void main(String[] args) {
        String[] str = {"java", "cable", "red", "vivid", "remedy", "grace"};
        String result = str[0];
        for (String each : str) {
            if (each.length() < result.length()) {
                result = each;
            }
        }
        System.out.println(result);

    }
}
