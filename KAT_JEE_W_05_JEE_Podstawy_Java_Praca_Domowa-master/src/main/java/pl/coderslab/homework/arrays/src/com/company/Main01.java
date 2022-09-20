package com.company;


import java.util.Arrays;
import java.util.Random;

public class Main01 {

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(Arrays.toString(append(arr)));
//
    }
    public static int[] append(int[] arr){
        int [] newArray = new int[arr.length*2];
        for(int i =0; i < arr.length; i++){
            newArray[i] = arr[i];

        }
        for (int i = arr.length; i <= newArray.length-1; i++) {
            System.out.println(i);
            newArray[i] = arr[arr.length-i+2];
        }
        return newArray;
    }


}
