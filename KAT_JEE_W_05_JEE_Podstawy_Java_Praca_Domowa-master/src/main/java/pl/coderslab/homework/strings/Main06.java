package pl.coderslab.homework.strings;


public class Main06 {


    public static void main(String[] args) {
        String str = "Zara3";
        int shift = 5;
        System.out.println(str);
        System.out.println(encode(str, shift));
        System.out.println(decode(encode(str,shift),shift));


    }
    public static  String encode(String str, int shift){
        StringBuilder sb = new StringBuilder(str);

        for( int i = 0; i <sb.length(); i++){
            int k = (int)sb.charAt(i);
            if( k + shift > 122){
                k = 31 + (shift-(122-k)) ;
            }else{
                k+= shift;
            }
            sb.setCharAt(i, (char)k);
        }
        return sb.toString();

    }
    public static  String decode(String str, int shift){
        StringBuilder sb = new StringBuilder(str);
        for( int i = 0; i <sb.length(); i++){
            int k = (int)sb.charAt(i);
            if( k - shift < 32){
                k = 123 - (shift-(k-32)) ;
            }else{
                k-= shift;
            }
            sb.setCharAt(i, (char)k);
        }
        return sb.toString();

    }


}
