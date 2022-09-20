package com.company;


public class Main02 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 4};
        System.out.println(contains(arr, 0));

    }

    public static boolean contains(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }

        }
        return false;
    }
}
