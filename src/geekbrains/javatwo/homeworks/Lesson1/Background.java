package geekbrains.javatwo.homeworks.Lesson1;

import java.awt.*;

public class Background {
    private final float timeInterval = 2f;
    private float timer;

    void setBg(GameCanvas canvas, float deltaTime) {
        timer += deltaTime;
        if (timer > timeInterval) {
            Color colorBg = new Color(
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255)
            );
            canvas.setBackground(colorBg);
            timer = 0;
        }
    }
}
