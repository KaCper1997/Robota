package pl.coderslab.homework.strings;


public class Main05 {

    public static void main(String[] args) {
        String str = "Zara y1";
        System.out.println(encode(str));

    }
    public static  String encode(String str){
        StringBuilder sb = new StringBuilder(str);
        int distance = 5;
        for( int i = 0; i <sb.length(); i++){
            int k = (int)sb.charAt(i);
            if( k + distance > 122){
                k = 31 + (distance-(122-k)) ;
            }else{
                k+= distance;
            }
            sb.setCharAt(i, (char)k);
        }
        return sb.toString();

    }

}
