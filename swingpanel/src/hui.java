
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class hui {

    public static void main(String[] args) {
        JLabel rlabel=new JLabel();
        rlabel.setText("hii m red");
        rlabel.setForeground(Color.black);
     
        JLabel glabel=new JLabel();
        glabel.setText("hii m green");
        glabel.setForeground(Color.black);
       
        JLabel blabel=new JLabel();
        blabel.setText("hii m blue");
        blabel.setForeground(Color.black);
      
        JPanel redpanel=new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 80, 80);
        JPanel greenpanel=new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(90, 90, 80, 80);
        JPanel bluepanel=new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(180, 180,80 , 80);
       
        
        JFrame frame=new JFrame();//create a frame;
        frame.setSize(500,500);//bcz frame is small so set size manually
        frame.setTitle("its about panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(redpanel);
        frame.add(greenpanel);
        frame.add(bluepanel);
        redpanel.add(rlabel);
        bluepanel.add(blabel);
        greenpanel.add(glabel);
        frame.setVisible(true);
        
    }
    
}
