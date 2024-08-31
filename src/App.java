import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int bWigth = 360;
        int bHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        // frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(bWigth, bHeight);
        frame.setLocationRelativeTo(null);

        FlappyBird f = new FlappyBird();
        frame.add(f);
        frame.pack();
        frame.setVisible(true);
    }
}
