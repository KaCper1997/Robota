package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main05 {

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\meblo\\Desktop\\Robota\\KAT_JEE_W_05_JEE_Podstawy_Java-master\\text5.txt");
            Scanner scan = new Scanner(file);
            Scanner scan3 = new Scanner(file);
            Scanner scan2 = new Scanner(System.in);
            int licznik = 0;
            while (scan.hasNextLine()) {
                scan.nextLine();
                licznik++;
            }
            String [][] tab = new String[2][licznik];
            while(scan3.hasNextLine()){
                out.println(scan3.nextLine());
                String xd = scan3.nextLine();
                out.println("Podaj wartość rankingu: ");
                String xs = scan2.nextLine();

                for(int i = 0; i < tab.length; i++){
                tab[0][i] = xd;
                tab[0][i] = xs;
                }
            }

            for(int i = 0; i < tab.length; i++){
                for(int j = 0; j < tab[i].length; j++){
                    out.println(tab[i][j]);
                }
            }


        } catch (FileNotFoundException e) {
            out.println("Nie można odnalźć pliku");
        }
    }
}
