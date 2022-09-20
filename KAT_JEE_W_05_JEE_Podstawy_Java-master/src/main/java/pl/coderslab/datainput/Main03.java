package pl.coderslab.datainput;

import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        getData();
    }
    public static void  getData(){
        int sum =0;
        int licznik = 0;
        int liczba = 0;
        System.out.println("Wprowadź liczby, 0 zatrzymuje sumowanie");
        Scanner scan = new Scanner(System.in);
        while ((liczba=scan.nextInt())!= 0){
            sum += liczba;
            licznik++;

        }
        System.out.println("Wprowadzono 0");
        System.out.println(sum);




    }
}
