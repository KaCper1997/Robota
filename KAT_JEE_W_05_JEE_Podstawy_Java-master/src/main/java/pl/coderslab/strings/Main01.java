package pl.coderslab.strings;

public class Main01 {

    public static void main(String[] args) {


    /*  String str = "CodersLab jak dobrze zacząć programować";
        char charAt = str.charAt(str.length() - 2);
        System.out.println(charAt);
        char[] charArray = str.toCharArray();
        int sum=0;
        for (int i = 0; i <str.length(); i++){
            if(charArray[i]==charAt){
                sum+=charArray[i];
            }

        }System.out.println(sum);*/
        String str = "CodersLab jak dobrze zacząć programować";
        char charAt = str.charAt(str.length() - 2);
        System.out.println(charAt);
        int ileRazy=0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)==charAt){
                ileRazy++;
            }
        }
        System.out.println(ileRazy);

    }
}
