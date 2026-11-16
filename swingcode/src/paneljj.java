
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class paneljj extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Blue filled rectangle
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 70);

        // Red outlined oval
        g.setColor(Color.RED);
        g.drawOval(200, 50, 80, 80);

        // Green filled oval
        g.setColor(Color.GREEN);
        g.fillOval(100, 150, 90, 60);

        // Black line
        g.setColor(Color.BLACK);
        g.drawLine(30, 200, 280, 200);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Shape Drawing Example");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new paneljj());

        frame.setVisible(true);
    }
}