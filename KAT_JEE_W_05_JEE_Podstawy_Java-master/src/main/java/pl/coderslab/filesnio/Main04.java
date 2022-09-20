package pl.coderslab.filesnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        String fileName = "text1.txt";
        writeToFile(fileName);
    }
    public static void writeToFile(String fileName){
        try {

            Path path = Paths.get(fileName);
            Scanner scan = new Scanner(System.in);
            List<String> outList = new ArrayList<>();
            String linia;
            System.out.println("Wprowadź kolejne linije tekstu");
            while (!(linia = scan.nextLine()).equalsIgnoreCase("quit")) {
                outList.add(linia);
                System.out.println(linia);



            }
            Files.write(path, outList);



        }catch (IOException ex){
            System.out.println("Nie można zapisać pliku");
        }
    }
}
