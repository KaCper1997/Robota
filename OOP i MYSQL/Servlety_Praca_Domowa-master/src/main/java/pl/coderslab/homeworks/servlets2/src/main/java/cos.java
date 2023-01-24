import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class cos {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrList.add(random.nextInt((100-1) + 1 ) + 1);
        }
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        Collections.sort(arrList);
        System.out.println();
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
    }
}
