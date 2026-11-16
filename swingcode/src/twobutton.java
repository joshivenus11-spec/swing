
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class twobutton extends JFrame implements ActionListener {
    JLabel label;
    JButton button1;
    JButton button2;
           
    
   twobutton(){
       label=new JLabel("button text will display");
       button1=new JButton("good");
       button2=new JButton("best");
       button1.addActionListener(this);
       button2.addActionListener(this);
       label.setBounds(150, 100, 200, 30);
button1.setBounds(100, 150, 100, 40);
button2.setBounds(250, 150, 100, 40);
         
       
      this.setSize(500, 500);
      this.setTitle("about 2 buttons");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.add(button1);
      this.add(button2);
      this.add(label);
      this.setLayout(null);
      this.setVisible(true);
       
   }
   public void actionPerformed(ActionEvent e){
       if(e.getSource()==button1){
           label.setText(String.valueOf(button1.getText()));
       }
       else{
           label.setText(String.valueOf(button2.getText()));
       }
       
   }
    public static void main(String[] args) {
        twobutton frame=new twobutton();
    }
    
}
