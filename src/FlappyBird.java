import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FlappyBird extends JPanel implements ActionListener {
    int bWigth = 360;
    int bHeight = 640;

    // Images
    Image back;
    Image birdImg;
    Image top;
    Image bottom;

    // Bird
    int birdX = bWigth / 8;
    int birdY = bHeight / 2;
    int birdW = 34;
    int birdH = 24;

    class Bird {
        int x = birdX;
        int y = birdY;
        int w = birdW;
        int h = birdH;
        Image img;

        Bird(Image img) {
            this.img = img;
        }
    }

    // game logic
    Bird bird;
    Timer gameLoop;

    FlappyBird() {
        setPreferredSize(new Dimension(bWigth, bHeight));
        setBackground(Color.blue);

        // Load images
        back = new ImageIcon(getClass().getResource("/assets/back.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("/assets/bird.png")).getImage();
        top = new ImageIcon(getClass().getResource("/assets/top.png")).getImage();
        bottom = new ImageIcon(getClass().getResource("/assets/bottom.png")).getImage();

        // bird
        bird = new Bird(birdImg);

        // game timer
        gameLoop = new Timer(1000 / 144, this); // 144 fps
        gameLoop.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        System.out.println("draw");
        // background
        g.drawImage(back, 0, 0, bWigth, bHeight, null);
        // bird
        g.drawImage(bird.img, bird.x, bird.y, bird.w, bird.h, null);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        repaint();
    }
}
