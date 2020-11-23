package Jair;

import java.util.Arrays;

public class Replit124 {
    public static void main(String[] args) {
        int[] numbs = {4,3,2,44,1,100,55};

        for (int i = 0; i< numbs.length/2;i++){
            int temp = numbs[i];
            numbs [i] = numbs[numbs.length-i-1];
            numbs [numbs.length-i-1]= temp;
        }
        System.out.println(Arrays.toString(numbs));
    }

}
