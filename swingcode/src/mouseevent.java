
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mouseevent extends JFrame implements MouseListener {

    JLabel label;

    mouseevent() {

        label = new JLabel("Click inside the frame");

        this.setSize(500, 500);
        this.setTitle("Mouse Listener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        this.add(label);

        this.addMouseListener(this);

        this.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {

        int x = e.getX();
        int y = e.getY();

        label.setText("Mouse at (" + x + "," + y + ")");
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {
        mouseevent frame = new mouseevent();
    }
}