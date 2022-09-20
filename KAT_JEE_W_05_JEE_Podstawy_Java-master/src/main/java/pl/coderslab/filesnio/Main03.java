package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main03 {

    public static void main(String[] args) {
        String directory ="C:/Users/meblo/Desktop/Robota/KAT_JEE_W_05_JEE_Podstawy_Java-master/src/main/java/pl/coderslab/filesnio/out/production/filesnio/pl/coderslab/filesnio.cipo";
        String fileName = "C:\\Users\\meblo\\Desktop\\Robota\\KAT_JEE_W_05_JEE_Podstawy_Java-master\\src\\main\\java\\pl\\coderslab\\filesnio\\out\\production\\filesnio\\pl\\coderslab\\filesnio.cipo\\cipa.txt";
        String secondFildName = "C:\\Users\\meblo\\Desktop\\Robota\\KAT_JEE_W_05_JEE_Podstawy_Java-master\\src\\main\\java\\pl\\coderslab\\filesnio\\out\\production\\filesnio\\pl\\coderslab\\filesnio.cipo\\cipa2.txt";;
        copyFile(directory,fileName,secondFildName);


    }
    public static void copyFile(String directory, String fileName, String secondFileName){
        try {
            Path path1 = Paths.get(directory);
            if(!Files.exists(path1)){
                Files.createDirectory(path1);
                System.out.println("Utworzono katalog");
            }else {
                System.out.println("Katalog już isnieje");
            }
            Path path2 = Paths.get(fileName);
            if(!Files.exists(path2)) {
                Files.writeString(path2, "pizda");
                System.out.println("Utworzono plik");
            }else {
                System.out.println("Plik już istnieje");
            }
            Path path3 = Paths.get(secondFileName);
            if(!Files.exists(path3)){
                Files.copy(path2, path3);
                System.out.println("Skopiowano plik");
            }else{
                System.out.println("Plik już skopiowano");
            }

        }catch (IOException ex){
            System.out.println("Pizda w chuj");;
        }

    }
}
