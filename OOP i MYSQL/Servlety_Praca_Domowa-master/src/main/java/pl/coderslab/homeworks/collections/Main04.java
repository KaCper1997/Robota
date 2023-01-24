package pl.coderslab.homeworks.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main04 {

    public static void main(String[] args) {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}\\,[a-zA-Z]{1,}\\,[a-zA-Z]{1,}\\,\\d{1,}\\,[a-zA-z]{1,}$";
        List<Person> personList = new ArrayList<>();

        try {
            File file = new File("C:\\Users\\meblo\\Desktop\\Robota\\OOP i MYSQL\\Servlety_Praca_Domowa-master\\people.csv");
            Scanner scan = new Scanner(file);
            Pattern pattern = Pattern.compile(regex);
            int n = 0;
            while (scan.hasNextLine()) {
                String sc = scan.nextLine();
                Matcher matcher = pattern.matcher(sc);
                if (matcher.matches()) {
                    personList.add(checkData(sc));
                    n++;
                }
            }
            Iterator<Person> it = personList.iterator();
            Map<Integer, List<Person>> peopleByAge = new HashMap<>();
            for (Person key : personList) {
                List<Person> list = new ArrayList<>();
                if( peopleByAge.containsKey(key.getAge())){
                    list.addAll(peopleByAge.get(key.getAge()));
                }
                list.add(key);
                peopleByAge.put(key.getAge(), list );
            }
            while (it.hasNext()) {
                System.out.println(n + " : " + it.next().toString());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Błąd");
        }
    }

    public static Person checkData(String data) {
        String[] dataCheck = data.split(",");
        return new Person(dataCheck[1], dataCheck[2], Integer.valueOf(dataCheck[3]), dataCheck[4]);
    }
}

