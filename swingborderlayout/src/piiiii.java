
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class piiiii {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setTitle("its aout border layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10,10));
         
       
        
        JPanel panel1= new JPanel();
         JPanel panel2= new JPanel();
          JPanel panel3= new JPanel();
           JPanel panel4= new JPanel();
 JPanel panel5= new JPanel();    
 panel1.setBackground(Color.red);
 panel2.setBackground(Color.blue);
  panel3.setBackground(Color.green);
   panel4.setBackground(Color.yellow);
    panel5.setBackground(Color.black);
    panel1.setPreferredSize(new Dimension(100,100));
     panel2.setPreferredSize(new Dimension(100,100));
      panel3.setPreferredSize(new Dimension(100,100));
       panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        //-----------------------------subpanels--------------------------//
        JPanel panel10= new JPanel();
         JPanel panel22= new JPanel();
          JPanel panel30= new JPanel();
           JPanel panel40= new JPanel();
 JPanel panel50= new JPanel();    
 panel10.setBackground(Color.pink);
 panel22.setBackground(Color.orange);
  panel30.setBackground(Color.LIGHT_GRAY);
   panel40.setBackground(Color.CYAN);
    panel50.setBackground(Color.DARK_GRAY);
    panel5.setLayout(new BorderLayout(10,10));
    panel10.setPreferredSize(new Dimension(100,100));
     panel22.setPreferredSize(new Dimension(18,10));
      panel30.setPreferredSize(new Dimension(90,10));
       panel40.setPreferredSize(new Dimension(10,80));
        panel50.setPreferredSize(new Dimension(10,10));
        panel5.add(panel10,BorderLayout.NORTH);
        panel5.add(panel22,BorderLayout.CENTER);
         panel5.add(panel30,BorderLayout.WEST);
          panel5.add(panel40,BorderLayout.EAST);
           panel5.add(panel50,BorderLayout.SOUTH);
        
        //--------------------------------------------------------------//
    frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.CENTER);
        frame.add(panel3,BorderLayout.SOUTH);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5,BorderLayout.WEST);
        frame.setVisible(true);
        
    }
    
}
