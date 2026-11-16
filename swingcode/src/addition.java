import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class addition extends JFrame implements ActionListener {

    JTextField field1;
    JTextField field2;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JButton button;

    addition() {

        label1 = new JLabel("enter first number:");
        label2 = new JLabel("enter second number:");
        label3 = new JLabel("the addition is:");

        label1.setBounds(50, 50, 150, 30);
        label2.setBounds(50, 100, 150, 30);
        label3.setBounds(50, 200, 200, 30);

        field1 = new JTextField();
        field2 = new JTextField();

        field1.setBounds(200, 50, 150, 30);
        field2.setBounds(200, 100, 150, 30);

        button = new JButton("add");
        button.setBounds(150, 150, 100, 30);
        button.addActionListener(this);

        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("addition calculator");
        this.setLayout(null);

        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(field1);
        this.add(field2);
        this.add(button);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            int num1 = Integer.parseInt(field1.getText());
            int num2 = Integer.parseInt(field2.getText());

            int result = num1 + num2;

            label3.setText("the addition is: " + result);
        }
    }

    public static void main(String[] args) {
        addition frame = new addition();
    }
}
