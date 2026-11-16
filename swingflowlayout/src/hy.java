
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class hy {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
frame.setSize(500, 500);
frame.setTitle("this is about flow layout");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

        JButton button1=new JButton("1");
         JButton button2=new JButton("2");
          JButton button3=new JButton("3");
           JButton button4=new JButton("4");
            JButton button5=new JButton("5");
             JButton button6=new JButton("6");
              JButton button7=new JButton("7");
               JButton button8=new JButton("8");
                JButton button9=new JButton("9");
//        frame.add(button1);
//        frame.add(button2);
//        frame.add(button3);
//        frame.add(button4);
//        frame.add(button5);
//        frame.add(button6);
//        frame.add(button7);
//        frame.add(button8);
//        frame.add(button9);
        JPanel panel=new JPanel();
        panel.setBackground(Color.gray);
        panel.setLayout(new FlowLayout());
        panel.setPreferredSize(new Dimension(300,300));
        panel.add(button1);
         panel.add(button2);
          panel.add(button3);
           panel.add(button4);
            panel.add(button5);
             panel.add(button6);
              panel.add(button7);
               panel.add(button8);
                panel.add(button9);
        
        
  frame.add(panel);              
frame.setVisible(true);    }
    
}
