package Main;
import Player.Keyboard;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel implements Runnable {
    Keyboard keyboard = new Keyboard();
    Thread gameThread;
    final double FPS = 60;

    public Game() {
        this.addKeyListener(keyboard);
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(800,600));
        this.setFocusable(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();

    }

    public void paintComponent(Graphics graph) {
        super.paintComponent(graph);
        Graphics2D graphics2D = (Graphics2D) graph;
        graphics2D.dispose();
    }

    public void update() {

    }

    @Override
    public void run() {
        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        while (gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;
            if (delta >= 1) {
                update();
                repaint();
                delta--;
            }
        }
    }
}




