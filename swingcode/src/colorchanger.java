
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class colorchanger extends JFrame implements ActionListener {
    JButton redbutton;
    JButton bluebutton;
    JButton greenbutton;
    colorchanger(){
        redbutton=new JButton("red");
        bluebutton=new JButton("blue");
        greenbutton=new JButton("green");
        redbutton.addActionListener(this);
        greenbutton.addActionListener(this);
        bluebutton.addActionListener(this);
        this.setSize(500,500);
        this.setTitle("about color background");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(redbutton);
        this.add(greenbutton);
        this.add(bluebutton);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        
    }
    
    public void actionPerformed (ActionEvent e){
        if(e.getSource()==redbutton){
            this.getContentPane().setBackground(Color.red);
        }
        if(e.getSource()==bluebutton){
            this.getContentPane().setBackground(Color.blue);
        }
        if(e.getSource()==greenbutton){
            this.getContentPane().setBackground(Color.green);
        }
        
    }
    public static void main(String[] args) {
        colorchanger frame=new colorchanger();
    }
    
}
