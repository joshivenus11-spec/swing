
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;


public class a {

    public static void main(String[] args) {
        JLabel label1=new JLabel();
        label1.setBackground(Color.red);
        label1.setOpaque(true);
        label1.setBounds(50, 50, 200, 200);
          JLabel label2=new JLabel();
        label2.setBackground(Color.GREEN);
        label2.setOpaque(true);
        label2.setBounds(100, 100, 200, 200);
          JLabel label3=new JLabel();
        label3.setBackground(Color.BLUE);
        label3.setOpaque(true);
        label3.setBounds(150, 150, 200, 200);
        JLayeredPane pane=new JLayeredPane();
        pane.setBounds(0,0, 500, 500);
        JFrame frame=new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("its about jlayered pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        frame.add(pane);
        pane.add(label1,Integer.valueOf(0));
//        pane.add(label2,Integer.valueOf(2));
        pane.add(label3,Integer.valueOf(1));
       
        
        frame.setVisible(true);
    }
    
}
