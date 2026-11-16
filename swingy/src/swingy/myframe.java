package swingy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class myframe extends JFrame implements ActionListener {

    JButton button;

    JTextField field1;
    JTextField field2;
    JTextField resultField;

    JLabel label1;
    JLabel label2;
    JLabel resultLabel;

    myframe() {

        // Labels
        label1 = new JLabel("Enter number 1");
//        label1.setBounds(100, 30, 150, 30);

        label2 = new JLabel("Enter number 2");
//        label2.setBounds(100, 100, 150, 30);

        resultLabel = new JLabel("Result");
//        resultLabel.setBounds(100, 170, 150, 30);

        // Text fields
        field1 = new JTextField();
//        field1.setBounds(100, 60, 200, 30);

        field2 = new JTextField();
//        field2.setBounds(100, 130, 200, 30);

        resultField = new JTextField();
//        resultField.setBounds(100, 200, 200, 30);

        // Button
        button = new JButton("ADD");
//        button.setBounds(150, 250, 100, 40);
        button.addActionListener(this);

        // Frame
        this.setTitle("Addition");
        this.setSize(450, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(null);

        // Add components
        this.add(label1);
        this.add(field1);

        this.add(label2);
        this.add(field2);

        this.add(resultLabel);
        this.add(resultField);

        this.add(button);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {

            int num1 = Integer.parseInt(field1.getText());
            int num2 = Integer.parseInt(field2.getText());

            int result = num1 + num2;

            resultField.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {

        myframe frame = new myframe();
    }
}
