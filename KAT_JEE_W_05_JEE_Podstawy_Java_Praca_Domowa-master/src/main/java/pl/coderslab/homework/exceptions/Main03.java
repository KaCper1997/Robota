package pl.coderslab.homework.exceptions;


public class Main03 {

    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(getLength(str));
        }catch (NullPointerException e){
            System.out.println("Brak napisu");
        }


    }
    public static int getLength(String str){
        int długosc = str.length();


        return długosc;
    }

}
