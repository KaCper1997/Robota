package com.company;

public class Main06 {
    public static void main(String[] args) {
        int age = 16;
        boolean person = checkMaturity(age);
        System.out.println(person);
    }
    public static boolean checkMaturity(int age) {
        boolean pełnoletni;
        if (age >= 18) {
            return true;
        } else {
            return false;
        }

    }


}




