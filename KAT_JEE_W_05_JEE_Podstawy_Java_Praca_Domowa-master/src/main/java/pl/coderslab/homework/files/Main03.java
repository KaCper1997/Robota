package pl.coderslab.homework.files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź nazwę pliku");
        String fileName = scan.next();
        System.out.println(checkFileExists(fileName));

    }
    public static boolean checkFileExists(String fileName){
        try {
            Path path = Paths.get(fileName);
            Scanner scan = new Scanner(System.in);
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println("Utworzono plik");


            }else {
                return true;
            }

        }catch (IOException ex){
            System.out.println("Pizda w chuj");;
        }
        return false;

    }

}
