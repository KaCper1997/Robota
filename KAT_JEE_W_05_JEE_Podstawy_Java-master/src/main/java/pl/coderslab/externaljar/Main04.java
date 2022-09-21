package pl.coderslab.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Main04 {
    public static void main(String[] args) {
        String str = "Kobyła ma mały bok";
        str = StringUtils.deleteWhitespace(str);
        System.out.println(checkPalindrome(str));



    }
    public static boolean checkPalindrome(String str){
        String str2 = StringUtils.reverse(str);
        System.out.println(str);
        if(str.compareToIgnoreCase(str2)==0){

            return  true;

        }else{
            return false;

        }



    }

}
