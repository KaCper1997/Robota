package pl.coderslab.homework.exceptions;


import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        try {
            String[] strTab = {"Twoja stara", "Twój stary", "Janek", "Włodek"};
            int index = 4;
            System.out.println(safeGet(strTab, index));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Podałeś index poza tablicą kretynie");
        }


    }public static String safeGet(String[] strTab, int index){
        String zmienna = strTab[index];



        return zmienna;
    }

}
