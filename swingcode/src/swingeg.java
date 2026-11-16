
import java.awt.Color;
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
public class swingeg extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    swingeg(){
        button=new JButton("click me");
        label=new JLabel();
        label.setVisible(false);
        button.addActionListener(this);
        button.setBounds(80, 200, 100, 60);
label.setBounds(200, 250, 150, 50);
         this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(label);
        this.add(button);
        this.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            label.setText("i am visible now");
            label.setVisible(true);
            this.getContentPane().setBackground(Color.red);
        }
        
    }
    public static void main(String[] args) {
        swingeg frame=new swingeg();
    }
    
}
