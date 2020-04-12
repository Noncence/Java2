package geekbrains.javatwo.homeworks.lesson3.homework3;

import java.util.HashMap;

public class PhoneBook {
    HashMap<String, HashMap<String, String>> phoneBook = new HashMap<>();

    public HashMap<String, HashMap<String, String>> add(Person person) {
        if (phoneBook.containsKey(person.getSurname())) {
            phoneBook.get(person.getSurname()).put(person.getEmail(), person.getPhoneNumber());
        } else {
            HashMap<String, String> map = new HashMap<>();
            map.put(person.getEmail(), person.getPhoneNumber());
            phoneBook.put(person.getSurname(), map);
        }
        return phoneBook;
    }

    public void getPhoneNumber(HashMap<String, HashMap<String, String>> map, String string) {
        System.out.println("Телефон: " + map.get(string).values());
    }

    public void getEmail(HashMap<String, HashMap<String, String>> map, String string) {
        System.out.println("Email: " + map.get(string).keySet());
    }
}
