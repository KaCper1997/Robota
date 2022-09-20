package pl.coderslab.homework.multiarrays;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main02 {

    public static void main(String[] args) {
        int[][] arr = {
                {4,32,12,5,7},
                {54,3,4,1,0},
                {8,65,76,9,78},
                {4,3,25,6,7},
                {4,5,2,4,6},
                {4,23,46,54,34}
        };
        System.out.println(Arrays.toString(minimum(arr)));


    }
    public static int[] minimum(int[][]arr){
        int min = 0;
        int[] arr2 = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            min = arr[i][0];
            arr2[i] = arr[i][0];
            for(int j =0; j<arr[i].length; j++){
                if(arr[i][j]< min){
                    min = arr[i][j];
                    arr2[i]= min;


                }
            }

        }
        return arr2;

    }

}
