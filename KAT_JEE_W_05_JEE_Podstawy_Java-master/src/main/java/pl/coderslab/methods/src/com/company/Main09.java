package com.company;

public class Main09 {

    public static void main(String[] args) {
        int n = 5;
        int natural = factorial(n);


    }

    public static int factorial(int n) {
        int e=1;
        for(int i=1 ; i<=n; i++){
             e *= i;
            System.out.println(e);


        }

        return n;

    }
}
