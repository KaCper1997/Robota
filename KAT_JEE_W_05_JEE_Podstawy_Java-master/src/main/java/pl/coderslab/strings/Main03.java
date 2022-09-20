package pl.coderslab.strings;

public class Main03 {

    public static void main(String[] args) {
        String str = "CodersLab";
        System.out.println(firstHalf(str));
    }

    static String firstHalf(String str){
        String secondString = str.substring(0,4);


        return secondString;



    }
}
