package pl.coderslab.exceptions;


public class Main05 {

    public static void main(String[] args) {
        try {
        int num = Integer.parseInt("23");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Zły format");
        }finally {
            System.out.println("kurwa");
        }


    }

}
