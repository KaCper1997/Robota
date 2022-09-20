package pl.coderslab.datainput;

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        textLines();
    }

    public static void textLines() {
        Scanner scan = new Scanner(System.in);
        int licznik = 0;
        System.out.println("Wpradż zdania, słowo \"quit\" zatrzymuje program ");
        String wpis;
        while (!(wpis = scan.nextLine()).equals("quit")) {
            System.out.println(wpis);
            licznik++;
        }
        System.out.println("Wprowadzono słowo \"quit\", program zatrzymano");
    }
}
