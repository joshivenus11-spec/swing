
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class practice extends JFrame  implements ActionListener{
    JLabel label;
    JButton button;
    practice(){
        label=new JLabel("chosen colour appears on me");
        label.setOpaque(true);
        button=new JButton("color");
        button.addActionListener(this);
        label.setBounds(150, 100, 200, 50);
button.setBounds(180, 200, 120, 40);
        this.setSize(500,500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(label);
        this.add(button);
        this.setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            JColorChooser c=new JColorChooser();
            Color color=JColorChooser.showDialog(null, "pick a color", Color.yellow);
            label.setForeground(color);
        }
        
    }
    public static void main(String[] args) {
        practice frame=new practice();
    }
}
