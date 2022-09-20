package pl.coderslab.files;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        try {
            File file = new File("text1.txt");
            Scanner scan = new Scanner(file);
            int licznik = 0;
            double sum = 0.0;
            while (scan.hasNext()) {
                licznik += 1;
                scan.next();
            }
            Scanner scan2 = new Scanner(file);
            String[] tab = new String[licznik];
            double[] tab2 = new double[licznik];
            for (int i = 0; i < tab.length; i++) {
                tab[i] = scan2.next();
                tab[i] = tab[i].replaceAll(",", " ");
                tab2[i] = parseDouble(tab[i]);

            }
            System.out.println(Arrays.toString(tab2));
            for (int i = 0; i < tab2.length; i++) {
                sum += tab2[i];
            }
            double srednia = sum / licznik;
            System.out.println(srednia);

        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku. ");
        }
    }

    public static double parseDouble(String value) {
        double el = 0.0;
        try {
            el = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.out.println("Niepoprawne dane.");
            return el;
        }
        return el;
    }
}