package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main03 {

    public static void main(String[] args) {
        List<City> cities = initialize();
        for (City city : cities) {
            System.out.print(city.name + " " + city.population + " ");
        }
        System.out.println();
        List<City>cities1 = firstSubList(cities,0,2);
        for (City city : cities1) {
            System.out.print(city.name + " " + city.population + " ");
        }

    }
    public static List<City> initialize() {
        City city1 = new City("Kościan", 26000);
        City city2 = new City("Poznań",540000);
        City city3 = new City("Gdańsk",582000);
        City city4 = new City("Zakopane", 27000);
        City city5 = new City("Szczecin",400000 );
        List<City> cities = new ArrayList<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);
        return cities;
    }
    public static List<City> firstSubList(List<City> list, int start, int end){
        List<City> subList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (start <= i && i <= end){
                subList.add(list.get(i));
            }
        }
        return subList;
    }
    public static List<City> secondSubList(List<City> list, int start, int end) {
        list.subList(0,4);
        return list;
    }
}



