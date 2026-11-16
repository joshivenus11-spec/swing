import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class myclass  extends JFrame{
    myclass(){

      
       this.setTitle("jframe title goes here");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//without it we usually hides the window but java pgm may stillbe running hence we use this 
       this.setSize(420,420);//sets the x and y dimesnsion as frame was small
       this.setResizable(false);//prevents frame from being resized
       
       
         ImageIcon image = new ImageIcon(myclass.class.getResource("/image/Pictures/logo.png")); ;//ctreates an image icon
        this.setIconImage(image.getImage());//change icon of frame
        this.getContentPane(). setBackground(Color.yellow);//jframe is the outer window 
//        getcontentpane gives you the inside are of jframe
        this.setVisible(true);//makes frame visible
    }
    public static void main(String[] args) {
        myclass obj=new myclass();
    }
    }

