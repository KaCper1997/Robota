package com.company;

import javax.print.DocFlavor;
import java.sql.SQLOutput;

public class Main01 {

    public static void main(String[] args) {
        System.out.println(dogAge(4));
    }
    static public double dogAge(double dogAge){
        if( dogAge <=2){
           double Age = dogAge * 10.5;
           return Age;
        }else{
            double Age = dogAge * 4 + (dogAge-2)*10.5;
            return Age;
        }
    }
}
