package geekbrains.javatwo.homeworks.lesson2.homework1.common;

import java.awt.*;

public interface GameCanvasListener {
    void onCanvasRepainted(GameCanvas canvas, Graphics g, float deltaTime);
}
