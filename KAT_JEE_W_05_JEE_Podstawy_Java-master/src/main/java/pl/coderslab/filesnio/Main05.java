package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\meblo\\Desktop\\Robota\\KAT_JEE_W_05_JEE_Podstawy_Java-master\\src\\main\\java\\pl\\coderslab\\filesnio\\fileName.html";
        readFromFile(fileName);

    }

    public static void readFromFile(String fileName) {
        try {
            Path path = Paths.get(fileName);
            Scanner scan = new Scanner(System.in);
            List<String> outList = new ArrayList<>();
            String linia;
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("Utworzono plik");
            } else {
                System.out.println("Plik już istnieje");
            }
            outList.add("<html>");
            outList.add("<body>");

            System.out.println("Wprowadź kolejne linije tekstu");
            while (!(linia = scan.nextLine()).equalsIgnoreCase("quit")) {
                outList.add(linia);
                System.out.println(linia);
            }
            outList.add("</body>");
            outList.add("</html>");
//            Files.writeString(path, "<html>");
//            Files.writeString(path, "<body>");
            Files.write(path, outList);
//            Files.writeString(path, "</html>");
//            Files.writeString(path, "</body>");
           ;
        } catch (
                IOException ex) {
            System.out.println("Pizda w chuj");
            ;
        }
    }
}
