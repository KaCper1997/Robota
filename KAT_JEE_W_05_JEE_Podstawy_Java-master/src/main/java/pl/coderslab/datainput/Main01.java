package pl.coderslab.datainput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        getInfo();




    }public static void getInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoja imię:");
        String imie = scan.next();
        System.out.println("Podaj swój wiek:");
        int wiek = scan.nextInt();
        System.out.println(imie + " ma " + wiek + " lat.");
    }
}
