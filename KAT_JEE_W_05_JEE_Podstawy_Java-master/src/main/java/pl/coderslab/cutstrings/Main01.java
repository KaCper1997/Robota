package pl.coderslab.cutstrings;

public class Main01 {

    public static void main(String[] args) {

        String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";

        String [] parts = str.split(" ");


        for(int i =0; i< parts.length; i++){
            System.out.println(parts[i]);
        }

    }
}

