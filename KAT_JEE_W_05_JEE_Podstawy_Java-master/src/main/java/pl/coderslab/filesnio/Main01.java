package pl.coderslab.filesnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main01 {

    public static void main(String[] args) {

            String directoryName = "C:/Users/meblo/Desktop/Robota/KAT_JEE_W_05_JEE_Podstawy_Java-master/src/main/java/pl/coderslab/filesnio/out/production/filesnio/pl/coderslab/filesnio.kurwa";
            createDirectory(directoryName);
    }
    public static void createDirectory(String directoryName){
        try {
            Path path = Paths.get(directoryName);
            if(!Files.exists(path)){
                Files.createDirectory(path);
                System.out.println("Utworzono katalog");
            }else {
                System.out.println("Katalog już istnieje");
            }

        }catch (IOException ex){
            System.out.println("Pizda w chuj");;
        }
    }
}
