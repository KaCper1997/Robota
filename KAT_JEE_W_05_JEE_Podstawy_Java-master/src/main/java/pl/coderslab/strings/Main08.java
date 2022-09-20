package pl.coderslab.strings;

public class Main08 {

    public static void main(String[] args) {
        String str = "TaK";
        System.out.println(toggleChar(str));

    }

    static String toggleChar(String str) {
        char[] newStr = str.toCharArray();
       char[] reverseSize = new char[newStr.length];
        for(int i = 0; i < reverseSize.length; i++){
            reverseSize[i] = newStr[i];
            if(Character.isUpperCase(reverseSize[i])){
                reverseSize[i]=Character.toLowerCase(newStr[i]);
            }else{
                reverseSize[i]= Character.toUpperCase(newStr[i]);
            }
            System.out.print(reverseSize[i]);


        }


        return "";
    }
}
