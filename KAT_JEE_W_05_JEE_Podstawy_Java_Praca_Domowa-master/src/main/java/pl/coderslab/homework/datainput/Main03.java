package pl.coderslab.homework.datainput;


import java.util.Arrays;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        retirement();
    }
    public static String[][] retirement() {
        Scanner scan = new Scanner(System.in);
        String wpis;
        int licznik = 0;
        String[][] pracownicy = new String[10][4];
        String[][] emerytowaniPracownicy = new String[10][2];
        System.out.println("Lista pracowników");
        while (!(wpis = scan.nextLine()).equals("quit")) {
            System.out.println("Podaj nazwisko: ");
            String nazwisko = scan.nextLine();
            System.out.println("Podaj imię: ");
            String imie = scan.nextLine();
            System.out.println("Podaj rok urodzenia: ");
            String rokUrodzenia = scan.nextLine();
            System.out.println("Podaj płeć : ");
            String plec = scan.nextLine();
            for (int i = licznik; i < pracownicy.length; i++) {
                for (int j = 0 ; j < pracownicy[i].length; j++) {
                    if (j == 0) {
                        pracownicy[i][j] = nazwisko;
                    } else if (j == 1) {
                        pracownicy[i][j] = imie;
                    } else if (j == 2) {
                        pracownicy[i][j] = rokUrodzenia;
                    } else if (j == 3) {
                        pracownicy[i][j] = plec;
                    }
                }
                for (int k = 0; k < pracownicy.length; k++) {
                    for (int l = 0; l < pracownicy[k].length; l++) {
                        if((2022 - Integer.parseInt(rokUrodzenia)) > 60 && plec.equals("K")) {
                            if (l == 0) {
                                emerytowaniPracownicy[k][l] = pracownicy[k][l];
                            } else if (l == 1) {
                                emerytowaniPracownicy[k][l] = pracownicy[k][l];
                            }
                        } else if ((2022 - Integer.parseInt(rokUrodzenia)) > 65 && plec.equals("M")) {
                            if (l == 0) {
                                emerytowaniPracownicy[k][l] = pracownicy[k][l];
                            } else if (l == 1) {
                                emerytowaniPracownicy[k][l] = pracownicy[k][l];
                            }
                        }
                    }
                }
                break;
            }

            licznik++;
        }
        for (int i = 0; i < pracownicy.length; i++) {
            System.out.println();
            for (int j = 0; j < pracownicy[i].length; j++) {
                if (pracownicy[i][j] == null) {
                    System.out.println("");
                } else {
                    System.out.print(pracownicy[i][j] + " ");
                }
            }
        }

        for (int i = 0; i < emerytowaniPracownicy.length; i++) {
            System.out.println();
            for (int j = 0; j < emerytowaniPracownicy[i].length; j++) {
                if (pracownicy[i][j] == null) {
                    System.out.println("");
                } else {
                    System.out.print(pracownicy[i][j] + " ");
                }
            }
        }
        return pracownicy;
    }
}
