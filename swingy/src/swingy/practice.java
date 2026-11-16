/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingy;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class practice extends JFrame  implements ActionListener{
    JButton button1;
    JLabel label;
    JButton button2;
    JButton button3;
    practice(){
        label = new JLabel("No button clicked yet");
        button1=new JButton("button1");
        button2=new JButton("button2");
        button3=new JButton("button3");
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        
        this.setSize(500, 500);
        this.setTitle("flow layout demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(label);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){
            label.setText("button1 is clicked");
        }
        else if(e.getSource()==button2){
             label.setText("button2 is clicked");
          
        }
        else if(e.getSource()==button3){
             label.setText("button3 is clicked");
        }
        else{
             label.setText("no button is clicked");
        }
        
    }
    public static void main(String[] args) {
        practice frame=new practice();
    }
    
}
