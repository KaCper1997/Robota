package pl.coderslab.homework.files;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.lang.System.out;

public class Main02 {

    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\meblo\\Desktop\\Robota\\KAT_JEE_W_05_JEE_Podstawy_Java_Praca_Domowa-master\\src\\main\\java\\pl\\coderslab\\homework\\files\\1.txt");
            Scanner scan = new Scanner(file);
            int licznik = 0;
            while (scan.hasNext()){
                licznik++;
                scan.next();
            }
            out.println(licznik);

        }catch (FileNotFoundException ex) {
            out.println("Nie można odnalźć pliku");
        }
    }

}
