package pl.coderslab.datainput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        try {
            operations();
        }catch(ArithmeticException r){
            System.out.println("Dzielenie przez 0");
        }




    }
    public static void operations(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int a = scan.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int b = scan.nextInt();
        int c = a+b;
        System.out.println(c);
        int d = a-b;
        System.out.println(d);
        int e = a*b;
        System.out.println(e);
        int f = a / b;
        System.out.println(f);





    }
}
