package pl.coderslab.homework.files;
import org.apache.commons.lang3.StringUtils;


import com.sun.source.tree.CompilationUnitTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.lang.System.out;

public class Main01 {

    public static void main(String[] args) throws FileNotFoundException {
        try{
            File file = new File("C:\\Users\\meblo\\Desktop\\Robota\\KAT_JEE_W_05_JEE_Podstawy_Java_Praca_Domowa-master\\src\\main\\java\\pl\\coderslab\\homework\\files\\1.txt");
            Scanner scan = new Scanner(file);
            int sum = 0;
//miałem policzyć ilość znaków wiec się zgadza, ale jakbym chciał uwzględnic spacje to trzeba zrobić tablice.
            while(scan.hasNextLine()) {
                String str = scan.next();
                int licznik = 0;
                for (int i = 0; i < str.length(); i++) {
                        licznik += 1;
                }
                sum += licznik;

            }
            out.println(sum);


        }catch (FileNotFoundException ex) {
            out.println("Nie można odnalźć pliku");
        }
    }

}
