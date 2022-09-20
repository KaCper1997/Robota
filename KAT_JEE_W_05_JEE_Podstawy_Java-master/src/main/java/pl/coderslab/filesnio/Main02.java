package pl.coderslab.filesnio;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main02 {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\meblo\\Desktop\\Robota\\KAT_JEE_W_05_JEE_Podstawy_Java-master\\src\\main\\java\\pl\\coderslab\\filesnio\\out\\production\\filesnio\\pl\\coderslab\\filesnio.kurwa\\tyKurwo.txt";
        createFile(fileName);


    }public static void createFile (String fileName){
        try {
            Path path = Paths.get(fileName);
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println("Utworzono plik");
            }else {
                System.out.println("Plik już istnieje");
            }

        }catch (IOException ex){
            System.out.println("Pizda w chuj");;
        }
    }

}
