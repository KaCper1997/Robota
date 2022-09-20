package pl.coderslab.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        try(PrintWriter printWriter = new PrintWriter("text1.txt")){
            Scanner scan = new Scanner(System.in);
            String linia;
            System.out.println("Podaj zdanie ");
            while (!(linia = scan.nextLine()).equalsIgnoreCase("quit")){
                printWriter.print(linia + "\n");
            }
        }catch (FileNotFoundException ex){
            System.out.println("Błąd zapisu do pliku.");
        }
    }
}
