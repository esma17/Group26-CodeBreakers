package Jair;

import java.util.Scanner;

public class Replit153 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {
        //person name: jon last name: doe age: 30
        //person("jon,doe,30");
        String [] infoArray = info.split(",");

        System.out.println("person name: "+infoArray[0]+" last name: "+infoArray[1]+" age: "+infoArray[2]);


    }//end person

}


