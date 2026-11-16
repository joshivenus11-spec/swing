
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class myframe  extends JFrame implements KeyListener {
    JLabel label;
    myframe(){
        label=new JLabel();
        label.setBounds(0,0,100,100 );
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.setSize(500, 500);
        this.setTitle("about key listner");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        this.add(label);
        this.addKeyListener(this);
         this.setVisible(true);
    }

   
    public static void main(String[] args) {
        myframe frame=new myframe();
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        switch(e.getKeyChar()){
//            case 'a':label.setLocation(label.getX()-1,label.getY());
//            break;
//            case 'b':label.setLocation(label.getX()+1, label.getY());
//            break;
//            case 'c':label.setLocation(label.getX(), label.getY()-1);
//            break;
//            case 'd':label.setLocation(label.getX()+1, label.getY()+1);
//            break;
//        }
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case 37:label.setLocation(label.getX()-1,label.getY());
            break;
            case 38:label.setLocation(label.getX()+1, label.getY());
            break;
            case 39:label.setLocation(label.getX(), label.getY()-1);
            break;
            case 40:label.setLocation(label.getX()+1, label.getY()+1);
            break;
        }
      
   }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
