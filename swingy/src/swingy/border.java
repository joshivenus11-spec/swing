package swingy;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class border extends JFrame implements ActionListener {
    JButton button1;
     JButton button2;
      JButton button3;
       JButton button4;
        JButton button5;
        JLabel label;
       

    border(){
        label=new JLabel("click a button");
        button1=new JButton("button1");
        button1.addActionListener(this);
         button2=new JButton("button2");
         button2.addActionListener(this);
          button3=new JButton("button3");
          button3.addActionListener(this);
           button4=new JButton("button4");
           button4.addActionListener(this);
            button5=new JButton("button5");
            button5.addActionListener(this);
            
            
        // Frame
        this.setSize(500, 500);
        this.setTitle("grid layout Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,3,10,10));

     
        this.add(button1);
        this.add(label);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            label.setText("button1 is clicked");
        }
        else if(e.getSource()==button2){
            label.setText("button2 is clicked");
        }
        else if(e.getSource()==button3){
            label.setText("button3");
        }
        else if(e.getSource()==button4){
            label.setText("button4");
        }
        else {
            label.setText("button5");
        }

        
    }

    public static void main(String[] args) {
        border frame = new border();
    }
}
