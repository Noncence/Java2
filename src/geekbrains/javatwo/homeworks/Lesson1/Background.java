package geekbrains.javatwo.homeworks.Lesson1;

import java.awt.*;

public class Background extends Sprite {
    private final float timeInterval = 2f;
    private float timer;

    @Override
    void update(GameCanvas canvas, float deltaTime) {
        super.update(canvas, deltaTime);
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

    @Override
    void render(GameCanvas canvas, Graphics g) {
        super.render(canvas, g);
    }

}
