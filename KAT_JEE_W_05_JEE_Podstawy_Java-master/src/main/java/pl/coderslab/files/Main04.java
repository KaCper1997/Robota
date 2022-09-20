package pl.coderslab.files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
public class Main04 {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("C:\\Users\\meblo\\Desktop\\Robota\\KAT_JEE_W_05_JEE_Podstawy_Java-master\\text4.txt");
            Scanner scan = new Scanner(file);
            int licznik = 0;
            while (scan.hasNextLine()) {
                licznik++;
                scan.nextLine();
            }
            Scanner scan2 = new Scanner(file);
            String[] tab = new String[licznik];
//            String [] tab2 = new String[licznik];
            for (int i = 0; i < tab.length; i++) {
                tab[i] = scan2.nextLine();
                if (contains(tab[i])) {
                    out.println(tab[i]);
                }
//                tab2[i] = mysplit(tab[i]);
//                out.println(tab[i]);
            }
        } catch (FileNotFoundException e) {
            out.println("Nie można odnalźć pliku");
        }
    }
    //    public static String mysplit(String s){
//        String [] parts = s.split("\\.");
//
//return s;
//    }
    public static boolean contains(String tab) {
        if (tab.toLowerCase().matches("(.*)javy(.*)")) {
            return true;
        }
        return false;
    }
}


