
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
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
public class mousemot extends JFrame  implements MouseMotionListener{
     JLabel coordLabel;
    mousemot(){
        coordLabel = new JLabel("Move the mouse...");
        this.setSize(500, 500);
        this.setTitle("mouse motion listner");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
         this.add(coordLabel);
        this.setVisible(true);
        
        this.addMouseMotionListener(this);
    }
    


    public void mouseDragged(MouseEvent e) {
       
    }


    public void mouseMoved(MouseEvent e) {
         int x = e.getX();
        int y = e.getY();

        coordLabel.setText("Mouse at: (" + x + ", " + y + ")");
    
    }
    public static void main(String[] args) {
        mousemot frame=new mousemot();
    }
    
}
