package pl.coderslab.homeworks.collections;

import java.util.Map;
import java.util.Set;

public class Main01 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = GenerateRandom.checkRand(10, 5);
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
