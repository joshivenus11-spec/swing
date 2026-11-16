
package swingy;



import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class nw extends JFrame implements MouseListener{
    JLabel label;
 nw(){
    label=new JLabel();
    label.setBounds(0,0, 100, 100);
    label.setBackground(Color.red);
    label.setOpaque(true);
    label.addMouseListener(this);
     this.setSize(500,500);
     this.setTitle("mouse listener");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(label);
     this.setLayout(null);
     this.setVisible(true);
     
 }

    
    public void mouseClicked(MouseEvent e) {
        System.out.println("you clicked a mouse");
        System.out.println("x:"+ e.getX());
        System.out.println("y:"+e.getY());
       
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("you pressed the mouse");
         System.out.println("x:"+ e.getX());
        System.out.println("y:"+e.getY());
     
   
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("you released the mouse");
         System.out.println("x:"+ e.getX());
        System.out.println("y:"+e.getY());
       
      
    }
    public void mouseEntered(MouseEvent e) {
        System.out.println("you entered the component");
         System.out.println("x:"+ e.getX());
        System.out.println("y:"+e.getY());
     
    }
    public void mouseExited(MouseEvent e) {
        System.out.println("you exited the component");
         System.out.println("x:"+ e.getX());
        System.out.println("y:"+e.getY());
    }
     public static void main(String[] args) {
        nw frame =new nw();
    }

    
}
