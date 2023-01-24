package pl.coderslab.setmap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main01 {

    public static void main(String[] args) {
        System.out.println("Wprowadź napisy");
        Scanner scan = new Scanner(System.in);
        Set<String> myHashSet = new HashSet<>();
        String s;
        int count = 0;
        while(!( s = scan.nextLine()).equalsIgnoreCase("exit")) {
            myHashSet.add(s);
            count++;
        }
        System.out.println("Podanych napisów: " + myHashSet.size() );
        System.out.println("Liczba napisów: " + count);

    }
}
