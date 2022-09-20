package com.company;

import java.sql.SQLOutput;

public class Main08 {

    public static void main(String[] args) {
        int a = 34;
        int b = 34;
        int c = -4;



        int maximum = maxOfThree(a, b, c );

    }

    public static int maxOfThree(int a, int b, int c) {
        if(a>=b){
            if(a>=c){
                System.out.println("Największa liczba to "+ a);
            }else{
                System.out.println("Największa liczba to " + c);
            }
        }else{
            if(b>=c){
                System.out.println("Największa liczba to "+ b);

            }else{
                System.out.println("Największa liczba to " + c);
            }
        }
        return a;
    }
}
