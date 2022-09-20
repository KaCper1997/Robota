package com.company;

public class Main04 {

    public static void main(String[] args) {

        Person person = new Person();
        person.unsubscribe("Jan", "Kowalski", "Kowal");
    }
}

class Person {
    void unsubscribe(String name, String surname, String nickname) {
        System.out.println(name + " " + surname + " " + nickname);
    }
}
