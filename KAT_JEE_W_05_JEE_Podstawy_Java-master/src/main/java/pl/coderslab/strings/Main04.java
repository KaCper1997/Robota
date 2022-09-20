package pl.coderslab.strings;

public class Main04 {

    public static void main(String[] args) {
        String str = " Dawaj hajs jebany  czarnuchu ";
        String search = "Hajs";
        System.out.println(containsStr(str, search));

    }

    static boolean containsStr(String str, String search) {
        if (str.toLowerCase().contains(search.toLowerCase())) {
            return true;
        }
        return false;
    }
}
