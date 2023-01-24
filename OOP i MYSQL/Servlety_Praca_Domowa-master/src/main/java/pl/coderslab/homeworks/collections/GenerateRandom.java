package pl.coderslab.homeworks.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {
    public static Map<Integer, Integer> checkRand(int amout, int interval) {
        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < interval; i++) {
            map.put(i, random.nextInt(amout));
        }
        return map;
    }
}
