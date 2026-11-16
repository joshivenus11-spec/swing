
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class charc extends JFrame implements KeyListener {

    JTextField field;
    JLabel label;

    charc() {

        field = new JTextField();
        label = new JLabel("Character count is: 0");

        field.addKeyListener(this);

        this.setSize(500, 500);
        this.setTitle("Character Counter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        this.add(field, BorderLayout.NORTH);
        this.add(label, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public void keyReleased(KeyEvent e) {
        int count = field.getText().length();
        label.setText("Character count is: " + count);
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        charc frame = new charc();
    }
}
