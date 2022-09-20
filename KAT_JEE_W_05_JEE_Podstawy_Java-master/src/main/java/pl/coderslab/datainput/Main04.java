package pl.coderslab.datainput;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        rowsColumns();

    }
    public static void rowsColumns(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy");
        int rows = scan.nextInt();

        System.out.println("Podaj liczbę kolumn");
        int columns = scan.nextInt();

        int [][] tab = new int[rows][columns];

        for(int i =0; i< rows; i++){
            for(int j =0; j<columns; j++){
                System.out.println("Wprowadź wartości tabeli"+'['+ i +']'+ '['+j+']');
                tab[i][j]= scan.nextInt();
            }

        }
        for(int i =0; i< tab.length;i++){
            for(int j =0; j<tab[i].length; j++){
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();

        }
        int sum =0;
        int licznik = 0;
        int średnia =0;
        for(int i =0; i< tab.length; i++){
            for(int j =0; j< tab[i].length; j++){
                sum +=tab[i][j];
                licznik++;
            }
            średnia = sum/licznik;
        }
        System.out.println(sum);
        System.out.println(średnia);
        scan.close();
    }
}
