
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class k {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Addition Program");
        frame.setSize(350, 250);
        frame.setLayout(null);

        // Create labels
        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(50, 30, 100, 30);
        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(50, 70, 100, 30);
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(50, 150, 200, 30);

        // Create text fields
        JTextField textField1 = new JTextField();
        textField1.setBounds(150, 30, 120, 30);
        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 70, 120, 30);

        // Create button
        JButton addButton = new JButton("Add");
        addButton.setBounds(120, 110, 80, 30);

        // Add action listener to button
        addButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                
    int num1 = Integer.parseInt(textField1.getText());
  int num2 = Integer.parseInt(textField2.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: " + sum);
                 
            }
        });

        // Add components to frame
        frame.add(label1);
        frame.add(label2);
        frame.add(resultLabel);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(addButton);

        // Make frame visible
        frame.setVisible(true);
    }
    
}
