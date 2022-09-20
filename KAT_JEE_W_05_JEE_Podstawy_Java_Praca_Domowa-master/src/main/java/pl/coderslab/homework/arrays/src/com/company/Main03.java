package com.company;


import javax.naming.NamingEnumeration;
import java.util.Arrays;

public class Main03 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 3, 1, 2};
        System.out.println(Arrays.toString(returnUnique(arr)));

    }

    public static int[] returnUnique(int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(arr);

        int [] newArr = new int[arr.length];
        newArr[0] = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(newArr[i-1] != arr[i]){
                newArr[i] = arr[i];
            }
        }
//        Arrays.sort(newArr);

        return newArr;

 /*       for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int liczbaA = arr[i];
                int liczbaB = arr[j];

                if (liczbaA > liczbaB) {
                    arr[i] = liczbaB;
                    arr[j] = liczbaA;
                }
            }
        }
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int liczba1 = arr[j];
                int liczba2 = arr[i];
                if (liczba1 == liczba2) {
                    newArr[i] = arr[j];
                }else{
                    newArr[i] = arr[i];
                }


            }
        }
        return newArr;*/

    }
}








