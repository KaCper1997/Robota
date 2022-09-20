package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        try {
            File file = new File("text1.txt");
            Scanner scan = new Scanner(file);
            int licznik = 0;
            while (scan.hasNextLine()) {
                licznik += 1;
                System.out.println(scan.nextLine());
            }

        }catch (FileNotFoundException ex){
            System.out.println("Błąd zapisu do pliku.");
        }




    }
}
