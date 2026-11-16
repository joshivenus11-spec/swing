/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class myframe extends JFrame implements ActionListener {
    JButton button;
     JTextField textField1;
      JTextField textField2;
      JLabel label3;
   myframe(){
        JLabel label1=new JLabel();
        label1.setBounds(50, 30, 100, 30);
        label1.setText("first number");
        JLabel label2=new JLabel();
        label2.setBounds(50, 70, 100, 30);
        label2.setText("second number");
        label3=new JLabel();
        label3.setBounds(50, 150, 200, 30);
        label3.setText("result");
       
       
          textField1 = new JTextField();
        textField1.setBounds(150, 30, 120, 30);
         textField2 = new JTextField();
        textField2.setBounds(150, 70, 120, 30);
        
         button=new JButton();
        button.setText("add them");
        button.setBounds(150, 100, 120, 30);
       button.addActionListener(this);
        

        
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("about addition");
        this.setLayout(null);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(textField1);
        this.add(textField2);
        this.add(button);
       
        this.setVisible(true);
        
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
                int num1 = Integer.parseInt(textField1.getText());
  int num2 = Integer.parseInt(textField2.getText());
                    int sum = num1 + num2;
                    label3.setText("Result: " + sum);
            
        }
       
    }
    public static void main(String[] args) {
        myframe frame=new myframe();
    }
}