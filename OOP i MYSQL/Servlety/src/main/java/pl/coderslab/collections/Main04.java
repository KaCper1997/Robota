package pl.coderslab.collections;

import java.util.ArrayList;
import java.util.List;

public class Main04 {

    public static void main(String[] args) {
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
       reverse(cities);

    }
    public static List<City> reverse(List<City> list) {
        List<City> reverseList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
                reverseList.add(list.get(i));
        }

        for (City city : reverseList) {
            System.out.println(city.name + " " + city.population + " ");
        }
        return reverseList;
    }
}
