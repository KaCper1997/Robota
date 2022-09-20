package pl.coderslab.homework.exceptions;


public class Main04 {

    public static void main(String[] args) {
        try {
            String str = "7";
            System.out.println(toInt(str));
        }catch (NumberFormatException e){
            System.out.println("Zły typ zmiennej");
        }
    }
    public static int toInt(String str){
        int zmienna=Integer.parseInt(str);
        return zmienna;

    }

}
