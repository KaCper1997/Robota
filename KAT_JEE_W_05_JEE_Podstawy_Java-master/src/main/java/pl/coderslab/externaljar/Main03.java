package pl.coderslab.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Main03 {
    public static void main(String[] args) {
        String[] str = {"życie","To","Kurwa"};
        stringFromArray(str);

    }

    public static String stringFromArray(String[] str) {
        System.out.println(StringUtils.join(str));
        return "0";
    }


}
