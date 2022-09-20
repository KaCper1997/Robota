package com.company;

public class Main03 {

    public static void main(String[] args) {
        double  pln = 100;
        double usd = 4.04;
        double cantor = convertToUsd(pln,usd);
        System.out.println(cantor);
    }
    public static double convertToUsd(double pln , double usd){
      double convert = pln/usd;
      return convert;
    }
}
