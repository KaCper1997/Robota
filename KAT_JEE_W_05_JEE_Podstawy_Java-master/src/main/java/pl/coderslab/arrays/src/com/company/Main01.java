package com.company;

public class Main01 {

    public static void main(String[] args) {
        String [] tab = {"00","01","02","03","04","05","06","07","08","09"};

        int [][] tab2 ={
                {10,11,12,13,14,15,16,17,18,19,},
                {20,21,22,23,24,25,26,27,28,29,},
                {30,31,32,33,34,35,36,37,38,39,},
                {40,41,42,43,44,45,46,47,48,49,},

        };


        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]+"," + " ");
        }
        System.out.println();

        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab2[i].length; j++) {
                System.out.print(tab2[i][j]+ ","+ " ");
            }
            System.out.println();
        }


    }
}
