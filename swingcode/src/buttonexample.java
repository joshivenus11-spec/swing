
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class buttonexample  extends JFrame implements ActionListener{
    JButton button1;
    JButton button2;
    buttonexample(){
        button1=new JButton("click me");
        button2=new JButton("submit");
        button1.addActionListener(this);
        button2.addActionListener(this);
        button1.setBounds(100, 100, 120, 40);
button2.setBounds(250, 100, 120, 40);
      
         this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("button");
        this.setLayout(null);
        this.add(button1);
        this.add(button2);
        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){
            JOptionPane.showMessageDialog(null, "clickme", "title", JOptionPane.PLAIN_MESSAGE);
        }
        else{
             JOptionPane.showMessageDialog(null, "submit", "title", JOptionPane.PLAIN_MESSAGE);
            
        }
        
    }
    public static void main(String[] args) {
        buttonexample frame=new buttonexample();
        
    }
    
}
