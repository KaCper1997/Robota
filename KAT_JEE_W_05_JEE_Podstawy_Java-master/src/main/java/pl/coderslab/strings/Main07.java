package pl.coderslab.strings;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main07 {

    public static void main(String[] args) {

        String str = "A to kanapa pana kota";
        String str2 = str.toLowerCase().replaceAll(" ", "");
        System.out.println(reverse(str2));

    }

    static char[] reverse(String str2) {
        char[] newStr = str2.toCharArray();
        char[] reverse = new char[newStr.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = newStr[newStr.length - 1 - i];
        }
        return reverse;

    }
}
