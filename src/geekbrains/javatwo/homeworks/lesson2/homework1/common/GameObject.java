package geekbrains.javatwo.homeworks.lesson2.homework1.common;

import java.awt.*;

public interface GameObject {
    void update(GameCanvas canvas, float deltaTime);
    void render(GameCanvas canvas, Graphics g);
}
