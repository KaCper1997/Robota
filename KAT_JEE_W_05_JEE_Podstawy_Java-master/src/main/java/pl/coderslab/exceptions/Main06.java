package pl.coderslab.exceptions;


public class Main06 {

    public static void main(String[] args) {
        try {
            System.out.println(divide(1, 0));
        }catch (IllegalArgumentException d){
            System.out.println("Dzielenie przez 0");
        }

    }

    static int divide (int a, int b){

        if(b <= 0){
            throw new IllegalArgumentException();
        }
        int c = a/b;
        return 1;
    }

}
