package pl.coderslab.cutstrings;

import java.util.Arrays;

public class Main04 {

    public static void main(String[] args) {
        String str = "Java-zadania-podsial-napisow";
        String separator = "-";
        onlyTwoElements(str,separator);



    }
    public  static String[] onlyTwoElements(String str, String separator){
        String[] parts = str.split(separator,2);

        for(int i=0; i < parts.length; i++){
            System.out.println(parts[i]);
        }





        return parts;

    }
}
