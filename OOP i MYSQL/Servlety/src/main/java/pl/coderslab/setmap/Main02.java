package pl.coderslab.setmap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> map = getMap();
        int counter = 0;
        System.out.println("Podaj przeciwieństwo: ");
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key);
            String str = sc.nextLine();
            if(str.equals(map.get(key))){
                counter++;
            }
        }
        System.out.println(counter);

    }
    public static Map<String, String> getMap(){
        Map<String,String> map = new HashMap<>();
        map.put("cieplo","zimno");
        map.put("jasno","ciemno");
        map.put("gruby","chudy");
        map.put("duzy","maly");
        map.put("szybko","wolno");
        return map;

    }
}
