package pl.coderslab.setmap;

import java.util.*;

public class Main03 {

    public static void main(String[] args) {
//        List<Country> countries = initialize();
//        Map<String, Country> map = getMap(countries);
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println(key + " - " + map.get(key).name);
//        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "pierwszy");
        map.put(1, "drugi");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
    public static List<Country> initialize() {
        List<Country> list = new ArrayList<>();
        list.add(new Country("Polska","Warszawa"));
        list.add(new Country("Francja","Paryż"));
        list.add(new Country("Niemcy","Berlin"));
        list.add(new Country("Włochy","Rzym"));
        list.add(new Country("USA","Waszyngton"));
        return list;
    }
    public  static Map<String, Country> getMap(List<Country> list) {
        Map<String,Country> map = new HashMap<>();
        for (Country key : list) {
            map.put(key.capital, key);
        }
        return map;

    }
}
