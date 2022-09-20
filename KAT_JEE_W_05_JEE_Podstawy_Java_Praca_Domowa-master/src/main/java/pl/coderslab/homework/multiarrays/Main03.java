package pl.coderslab.homework.multiarrays;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main03 {

    public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 30, 5},
                {4, 28, 6, 5}
        };

        System.out.println(Arrays.toString(lessMore(arr)));



    }

    public static int[] lessMore(int[][] arr) {
        int arithmticMEAN = 0;
        int sum = 0;
        int ilosc = 0;
        int howMuchLess = 0;
        int howMuchMore = 0;
        int[] arr2 = new int[2];
        for (int i = 0; i < arr.length; i++) {
            ilosc += arr[i].length;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

        }
        arithmticMEAN = sum/ilosc;
        System.out.println(arithmticMEAN);
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                if (arr[a][b] < arithmticMEAN) {
                    howMuchLess = arr[a].length-1;
                    arr2[a] = howMuchLess;
                } else if (arr[a][b] > arithmticMEAN) {

                    howMuchMore = arr[a].length-1;
                    arr2[a] = howMuchMore;
                }

            }

        }

        return arr2;


    }

}
