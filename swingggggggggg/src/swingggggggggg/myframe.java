
package swingggggggggg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class myframe extends JFrame implements ActionListener {
    JButton button;
    JTextField field;
   myframe(){
       field =new JTextField();
       field.setPreferredSize(new Dimension(250,250));
       field.setForeground(Color.red);
       field.setBackground(Color.black);
       field.setText("username");
     
       button=new JButton();
       button.setText("submit");
       button.addActionListener(this);
       this.setSize(500,500);
       this.setTitle("this is about textfields");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new FlowLayout());
       this.add(field);
       this.add(button);
       this.setVisible(true);
   }

   

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println("welcome"+" "+field.getText());
            button.setEnabled(false);
            
        }
    }
    
    public static void main(String[] args) {
        myframe frame=new myframe();
    }
}

