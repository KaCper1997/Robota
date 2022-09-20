package com.company;

public class Main05 {

    public static void main(String[] args)
    {

        double gorss = 20;
        double vat= 0.23;
        double product = calculateNetto(gorss, vat);
        System.out.println(product);

    }
    public static  double calculateNetto(double gorss, double vat)
    {
        double rate = gorss - (gorss * vat);
        return rate;
    }
}
