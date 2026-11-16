
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class heyo {

    public static void main(String[] args) {
        
       //j label is used to write small string or image or both inside a frame
        JLabel label=new JLabel();//create a label
        label.setText("heyo i am label");//write something on label
        ImageIcon image_ = new ImageIcon(heyo.class.getResource("/image/logo.png"));
        label.setIcon(image_);
        label.setHorizontalTextPosition(JLabel.CENTER);//change alignment of text
        label.setVerticalTextPosition(JLabel.NORTH);
        label.setForeground(Color.red);//change colour of label
label.setIconTextGap(1);//sets the gap between image and label
label.setBackground(Color.black);//sets background colour
label.setVerticalAlignment(JLabel.CENTER);//set both image text into cener
label.setHorizontalAlignment(JLabel.CENTER);
label.setOpaque(true);
label.setBounds(25, 25, 145, 145);//sets java how big  and where my label should be 
       JFrame frame=new JFrame();
       frame.setSize(500,500);
       frame.setLayout(null);//donot let layout manager automatically position my components
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("its about jlabels");
      
       frame.add(label);
    frame.setVisible(true);}
    
}
