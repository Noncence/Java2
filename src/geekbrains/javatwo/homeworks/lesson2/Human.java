package geekbrains.javatwo.homeworks.lesson2;

public interface Human extends Animal {
    default void walk() {
        System.out.println("on legs");
    }
    void think();
}
