import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FlappyBird extends JPanel {
    int bWigth = 360;
    int bHeight = 640;

    // Images
    Image back;
    Image bird;
    Image top;
    Image bottom;

    FlappyBird() {
        setPreferredSize(new Dimension(bWigth, bHeight));
        setBackground(Color.blue);

        // Load images
        back = new ImageIcon(getClass().getResource("/assets/back.png")).getImage();
        bird = new ImageIcon(getClass().getResource("/assets/bird.png")).getImage();
        top = new ImageIcon(getClass().getResource("/assets/top.png")).getImage();
        bottom = new ImageIcon(getClass().getResource("/assets/bottom.png")).getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        // background
        g.drawImage(back, 0, 0, bWigth, bHeight, null);
    }
}
