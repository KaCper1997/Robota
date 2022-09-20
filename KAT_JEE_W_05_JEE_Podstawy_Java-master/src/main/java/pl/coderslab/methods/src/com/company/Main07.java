package com.company;

public class Main07 {

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(10));

    }

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return number + " even";
        } else {
            return number + " odd";
        }
    }
}
