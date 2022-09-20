package pl.coderslab.datainput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main06 {

    public static void main(String[] args) {
        equation();
    }
    public static void equation(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj współczynnik a:");
        double a = scan.nextInt();
        System.out.println("Podaj współczynnik b:");
        double   b = scan.nextInt();
        System.out.println("Podaj współczynnik c:");
        double c = scan.nextInt();
        double delta = Math.pow(b,2)-(4*a*c);
        System.out.println("\u0394 wynosi: " + delta);
        double pierwiastekZdelty = Math.sqrt(delta);
        System.out.println("\u221A\u0394 wynosi: " + pierwiastekZdelty);
        double x1= (-b+pierwiastekZdelty)/(2*a);
        System.out.println("x\u2081 wynosi: "+ x1);
        double x2= (-b-pierwiastekZdelty)/(2*a);
        System.out.println("x\u2082 wynosi: "+ x2);

    }
}
