package pl.coderslab.homework.datainput;


import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        printTriangle();
    }
    public static void printTriangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wymiar.");
        int wymiar = scan.nextInt();
        String empty ="";
        for(int i = 0; i < wymiar; i++){
            System.out.println();
            for( int j = 0; j < wymiar; j++) {
                if (j <= i) {
                    String iks = "x ";
                    System.out.print(iks);
                }
            }
        }
        System.out.println(empty);



    }

}
