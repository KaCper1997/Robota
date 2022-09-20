package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main05 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] reverse = new int[numbers.length];

        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for(int i = 0; i < numbers.length; i++){
            reverse[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println(Arrays.toString(reverse));

    }


}
