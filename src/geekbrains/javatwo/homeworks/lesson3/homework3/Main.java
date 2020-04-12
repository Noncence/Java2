package geekbrains.javatwo.homeworks.lesson3.homework3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String[] worlds =  {"стол", "стул", "кот", "слон", "монитор", "кирпич", "стул", "крот",
                "весна", "человек", "кот", "машина", "корабль", "магазин", "монитор", "окно",
                "лето", "мебель", "гроза", "зима", "стакан", "лето" };

        System.out.println(searchWord(worlds));
        System.out.println(howManyWord(worlds));
        System.out.println();

        PhoneBook phoneBooks = new PhoneBook();
        phoneBooks.add(new Person("Иванов", "ivanov1@mail.ru", "89123345"));
        phoneBooks.add(new Person("Петров", "petrov1@mail.ru", "892323422"));
        phoneBooks.add(new Person("Петров", "petrov1@mail.ru", "8933463333"));
        phoneBooks.add(new Person("Сидоров", "sidirov@mail.ru", "894908449"));
        phoneBooks.add(new Person("Иванов","ivanov2@mail.ru", "8955989555"));
        phoneBooks.add(new Person("Орлов","orlov1@mail.ru", "8966789166"));
        phoneBooks.add(new Person("Перцев", "percev@mail.ru", "8922890777"));
        phoneBooks.add(new Person("Иванов", "ivanov3@mail.ru", "8983450880"));
        phoneBooks.add(new Person("Орлов", "orlov2@mail.ru", "8909938099"));
        phoneBooks.add(new Person("Никитин", "nikitin@mail.ru", "891567089"));
        System.out.println(phoneBooks.phoneBook);
        phoneBooks.getPhoneNumber(phoneBooks.phoneBook, "Иванов");
        phoneBooks.getEmail(phoneBooks.phoneBook,"Иванов");
    }

    //1.1 Найти список слов, из которых состоит текст (дубликаты не считать);
    public static ArrayList<String> searchWord(String[] worlds) {
        HashSet<String> hashSet = new HashSet<>();
        ArrayList <String> arrayList = new ArrayList<>();
        for (int i = 0; i < worlds.length; i++) {
            hashSet.add(worlds[i]);
        }
        for (String word : hashSet) {
            arrayList.add(word);
        }
        return arrayList;
    }
    // 1.2 Посчитать сколько раз встречается каждое слово (использовать HashMap);

    public static HashMap<String, Integer> howManyWord(String[] worlds){
        HashMap<String, Integer> hashMap = new HashMap<>();
        int count = 1;
        for (int i = 0; i < worlds.length ; i++) {
            if(hashMap.containsKey(worlds[i])){
                hashMap.put(worlds[i], count + 1);
            } else {
                hashMap.put(worlds[i], count);
            }
        }
        return hashMap;
    }
}
