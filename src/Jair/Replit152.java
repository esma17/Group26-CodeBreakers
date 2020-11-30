package Jair;

import java.util.ArrayList;
import java.util.Scanner;

public class Replit152 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);

    }

    public static void plus_minus(int[] numbers) {
        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> zeros = new ArrayList<>();

        for (int each : numbers) {
            if (each > 0) {
                positives.add(each);
            } else if (each < 0) {
                negatives.add(each);
            }else {
                zeros.add(each);
            }
        }
        System.out.println("positives:"+positives.size()+", negatives:"+negatives.size()+", zeros:"+zeros.size());


    }


}
