package geekbrains.javatwo.homeworks.Lesson1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainCircles extends JFrame {
    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private int countBalls = 0;
    private static final int NUMBER_OF_BALLS = 50;
    Sprite[] sprites = new Sprite[NUMBER_OF_BALLS];

    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               new MainCircles();
           }
       });
    }

    private MainCircles() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        GameCanvas canvas = new GameCanvas(this);
        add(canvas, BorderLayout.CENTER);
        setTitle("Circles");
        initApplication(countBalls);
        setVisible(true);

        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                if (e.getButton() == MouseEvent.BUTTON1) {
                    if (countBalls < NUMBER_OF_BALLS) {
                        initApplication(countBalls);
                        countBalls++;
                    }
                } else if (e.getButton() == MouseEvent.BUTTON3) {
                    if (countBalls > 0){
                        countBalls--;
                    }
                }

            }
        });
    }

    private void initApplication(int countBalls) {
         sprites[countBalls] = new Ball();

    }

    void onCanvasRepainted(GameCanvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(GameCanvas canvas, float deltaTime) {
        for (int i = 0; i < countBalls; i++) {
            sprites[i].update(canvas, deltaTime);
        }
    }

    private void render(GameCanvas canvas, Graphics g) {
        for (int i = 0; i < countBalls; i++) {
            sprites[i].render(canvas, g);
        }
    }
}
