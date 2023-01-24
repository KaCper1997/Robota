package pl.coderslab.regex;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main03 {
    private static final String REGEX = "(\\d\\s*[+\\-*/]\\s*\\d*)*\\s*=\\s*\\d";

    public static void main(String[] args) {
        Path path = Paths.get("opt.txt");
        System.out.println("Wprowadź działania");
        Scanner scan = new Scanner(System.in);
        List<String> myList = new ArrayList<>();
        String s;
        while (!(s = scan.nextLine()).equalsIgnoreCase("quit")) {
            if (verifyEmail(s)) {
                myList.add(s.replaceAll("\\s", ""));
            }
        }
        try {
            Files.write(path, myList);
        } catch (IOException ex) {
            System.out.println("Błąd zapisu do pliku.");
        }
    }

    static boolean verifyEmail(String s) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
