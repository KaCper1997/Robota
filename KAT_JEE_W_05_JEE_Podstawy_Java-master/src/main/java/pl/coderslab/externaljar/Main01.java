package pl.coderslab.externaljar;
import org.apache.commons.lang3.StringUtils;

public class Main01 {

    public static void main(String[] args) {
        String str = "Tak";
        reverseString(str);
    }

    public static String reverseString(String str) {
        System.out.println(StringUtils.reverse(str));
        return str;
    }


}
