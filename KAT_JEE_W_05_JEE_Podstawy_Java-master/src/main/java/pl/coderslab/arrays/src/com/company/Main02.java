package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main02 {

    public static void main(String[] args) {
        int [] randNumbers = new int [20];
        Random r = new Random();
        for(int i=0; i<randNumbers.length; i++)
            randNumbers[i]=r.nextInt(100)+1;

        for (int i = 0; i < randNumbers.length; i++) {
            System.out.print(randNumbers[i] + ", ");
        }
        int min = randNumbers[0];
        for (int i = 0; i < randNumbers.length; i++){
            if (randNumbers[i] < min){
                min = randNumbers[i];
            }
        }
        System.out.println();
        System.out.print(min);




    }
}
