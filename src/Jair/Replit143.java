package Jair;

import java.util.Arrays;

public class Replit143 {
    public static void main(String[] args) {
        int [][] multiplicationTable = new int[10][10];

        for (int j =1;j<=10;j++) {
            for (int i = 1; i <= 10; i++) {
                multiplicationTable[j-1][i-1] = i*j;
            }
        }

        //TODO: type your code below


        //Do not modify below line it will be used to test your code. And
        //Can be used by you while developing your code
        System.out.println(Arrays.deepToString(multiplicationTable) ) ;
    }
}
