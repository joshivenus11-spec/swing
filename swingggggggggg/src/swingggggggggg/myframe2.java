
package swingggggggggg;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class myframe2  extends JFrame implements ActionListener{
    myframe2(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
       
        JCheckBox box=new JCheckBox();
        this.add(box);
         this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    public static void main(String[] args) {
        myframe frame=new myframe();
    }
    }
    
    

