package com.company;

import java.util.Arrays;

public class Main06 {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 345, 235, 754, 99, 0, 0, 3};
        int[] secondNumbers = {2, 0, 20, 42, 65, 4, 2, 7, 523, 1};
        int[] thirdNumbers = new int[numbers.length];


        for (int i = 0; i < thirdNumbers.length; i++) {
            thirdNumbers[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println(Arrays.toString(thirdNumbers));

    }
}
