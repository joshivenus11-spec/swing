/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package button;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class Button extends JFrame implements KeyListener {
    JLabel label2;
    JTextField field1;
    Button(){
        this.setSize(300, 300);
        this.setTitle("character count");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
       JLabel label1=new JLabel();
       label1.setText("type something:");
       label1.setBounds(0, 0, 120, 30);
       label2=new JLabel();
       label2.setText("characters:");
       label2.setBounds(0,30,120,30);
        field1=new JTextField();
        field1.setBounds(130, 0, 120, 30);
        field1.addKeyListener(this);
      
     
       this.add(label1);
       this.add(label2);
       this.add(field1);
      
        this.setVisible(true);
        
    }

    
 

    
        
    

    @Override
    public void keyTyped(KeyEvent e) {
        
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource()==field1){
            int length=field1.getText().length();
            label2.setText("characters"+ length);
           
            
        }
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        Button frame=new Button();
    }
    
}
