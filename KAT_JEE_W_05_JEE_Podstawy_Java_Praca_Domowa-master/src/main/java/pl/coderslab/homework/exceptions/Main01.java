package pl.coderslab.homework.exceptions;


public class Main01 {

    public static void main(String[] args) {
        String a = "3";
        String b = "0";
        try {
            average(a, b);
        }
        catch(ArithmeticException ex){
            System.out.println("Dzielenie przez 0");
        }finally {
            System.out.println("TO KONIEC");
        }


    }
    public static void average(String a, String b){
        double c = Double.parseDouble(a);
        double d = Double.parseDouble(b);
        double e = c/d;
        System.out.println(e);

    }

}
