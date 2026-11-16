
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class NewClass implements ActionListener {
   
    public static void main(String[] args) {
        JLabel label1=new JLabel();
        label1.setBounds(50, 30, 100, 30);
        label1.setText("first number");
        JLabel label2=new JLabel();
        label2.setBounds(50, 70, 100, 30);
        label2.setText("second number");
        JLabel label3=new JLabel();
        label3.setBounds(50, 150, 200, 30);
        label3.setText("result");
       
       
         JTextField textField1 = new JTextField();
        textField1.setBounds(150, 30, 120, 30);
        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 70, 120, 30);
        
         JButton button=new JButton();
        button.setText("add them");
        button.setBounds(150, 100, 120, 30);
       button.addActionListener(this);
        

        JFrame frame=new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("about addition");
        frame.setLayout(null);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(button);
       
        frame.setVisible(true);
        
    

   
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
