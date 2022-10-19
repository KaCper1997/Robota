package pl.coderslab.homework.files;


import org.apache.commons.lang3.StringUtils;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



public class Main04 {
    public static void main(String[] args) {

        rewrite();
    }

    public static void rewrite() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź nazwę pliku");
        String fileName = scan.next();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Wprowadź tekst");
        String tet = scan2.next();
        try {
            Path path = Paths.get(fileName + ".txt");
            if (Files.exists(path)) {
                Path path2 = Paths.get(fileName + "_2.txt");
                Files.createFile(path2);
//                Files.copy(path,path2);
                String str = StringUtils.repeat(tet, "\n", 2);
                Files.writeString(path2, str);
                System.out.println("Utworzono plik z suffiksem");
            } else {
                Files.createFile(path);
                Files.writeString(path, tet);
                System.out.println("Utworzono plik");
            }
            Files.writeString(path, tet);
        } catch (IOException ex) {
            System.out.println("Pizda w chuj");
            ;
        }

    }


}
