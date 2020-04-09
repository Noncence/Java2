package geekbrains.javatwo.homeworks.lesson2;

public interface Bull extends Animal {
    void voice();
    default void walk() {
        System.out.println("on hooves");
    }
}
