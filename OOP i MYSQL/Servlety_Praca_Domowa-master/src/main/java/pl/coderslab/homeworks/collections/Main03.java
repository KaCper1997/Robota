package pl.coderslab.homeworks.collections;

import java.net.ServerSocket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main03 {
    public static void main(String[] args) {
        System.out.println(verifyLogin("0chmieL-97"));

    }
    static boolean verifyLogin(String login) {
        String regex = "\\D{1,}[a-zA-Z0-9_-]{5,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(login);
        if (login.equalsIgnoreCase(regex)) {
            return false;
        }
return matcher.matches();
    }

}
