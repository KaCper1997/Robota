package pl.coderslab.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main02 {

    public static void main(String[] args) {
        System.out.println(verifyPassword("PiĘkNyDzIeŃ"));

    }
    static boolean verifyPassword(String password) {
        String regex = "^(?!.*[a-z]{2})(?!.*[A-Z]{2})"
                +"(?=\\S+$).{10,15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (password == null) {
            return false;
        }
        return matcher.matches();
    }
}
