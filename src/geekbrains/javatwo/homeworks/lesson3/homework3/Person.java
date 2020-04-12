package geekbrains.javatwo.homeworks.lesson3.homework3;

public class Person {
    private String surname;
    private String email;
    private String phoneNumber;

    public Person(String surname, String email, String phoneNumber) {
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}