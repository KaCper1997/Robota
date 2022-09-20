package pl.coderslab.homework.datainput;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        sortedArray();


    }
    public static int[] sortedArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb do losowania");
        int quanityNumbers = scan.nextInt();
        int[] randNumbers = new int [quanityNumbers];
        Random r = new Random();
        for(int i = 0; i < quanityNumbers; i++){
            randNumbers[i] = r.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(randNumbers));
     Arrays.sort(randNumbers);
       System.out.println(Arrays.toString(randNumbers));


return randNumbers;
    }


}
