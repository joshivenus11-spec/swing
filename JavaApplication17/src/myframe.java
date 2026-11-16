
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class myframe extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    myframe(){
         this.setSize(500, 500);
        this.setTitle("about radio button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button=new JButton("color");
        button.addActionListener(this);
        
        label=new JLabel();
        label.setText("choose a colour");
        label.setForeground(Color.black);
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        this.add(label);
        this.add(button);
        this.setVisible(true);
   

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JColorChooser chooser=new JColorChooser();
            Color color = JColorChooser.showDialog(null, "pick a color", Color.BLACK);
            label.setForeground(color);
        }
        
    }
    public static void main(String[] args) {
        myframe frame=new myframe();
    }
}
