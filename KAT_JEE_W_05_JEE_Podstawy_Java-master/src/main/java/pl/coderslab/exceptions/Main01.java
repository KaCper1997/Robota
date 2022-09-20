package pl.coderslab.exceptions;


public class Main01 {

    public static void main(String[] args) {
            int number = -7;
            try{
                System.out.println(factorial(number));
            }catch(IllegalArgumentException e){
                System.out.println("Podałeś złą liczbę ty kurwo ");

        }
    }

    static int factorial(int number)  {
        int result = 1;
        if(number < 0){
            throw new IllegalArgumentException();
        }
        for (int i = 1; i <= number; i++) {

            result *= i;
        }
        return result;
    }
}
