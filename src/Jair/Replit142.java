package Jair;

import java.util.Scanner;

public class Replit142 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt();
        int cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols
        }//end for rows
        int maxNumber = arr [0][0];
        for (int [] each: arr
             ) {
            for (int each1:each
                 ) {
                if(each1>maxNumber){
                    maxNumber=each1;
                }

            }

        }
        System.out.println(maxNumber);


        //TODO write your code below


    }//end main
}
