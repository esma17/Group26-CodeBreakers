package Jair;

public class REplit135 {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String [] word = sentence.split(" ");
        for (int i = word.length-1;i >=0; i--){
            System.out.println(word [i]);
        }


    }

}
