package pl.coderslab.externaljar;

import org.apache.commons.lang3.StringUtils;

import static pl.coderslab.externaljar.Main01.reverseString;

public class Main02 {
    public static void main(String[] args) {
        String str = "Tak";
        toggleChar(str);
    }

    public static String toggleChar(String str) {
        System.out.println(StringUtils.swapCase(str));
        return str;
    }


}
