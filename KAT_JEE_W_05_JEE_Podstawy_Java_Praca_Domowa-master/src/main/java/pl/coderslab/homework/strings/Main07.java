package pl.coderslab.homework.strings;


import java.util.Arrays;

public class Main07 {
    public static void main(String[] args) {
        String str = "Twoja stara to nie twoja stara";
        String [] words = {"stara"};
        System.out.println(censor(str,words));

    }
    public static String censor(String str, String[] words){
        String [] arr = str.split(" ");
        for(int i = 0; i< arr.length; i++){
            if(arr[i].equalsIgnoreCase(words[0])){
                arr[i]="****";
            }
        }

        StringBuilder str2 = new StringBuilder();
        for(int k =0; k< arr.length; k++){
            str2.append(arr[k]+ " ");

        }

        System.out.println(str2.toString());

        return ""; // generalnie to trochę oszukałem to zadanie tym cudysłowem ale nie potrafie inaczej nie wiem jak to zmienić żebym mógł zwrócić Stringa
    }

}
