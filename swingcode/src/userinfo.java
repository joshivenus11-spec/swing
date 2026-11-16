
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class userinfo extends JFrame implements ActionListener {
    JTextField namefield;
    JTextField emailfield;
    JTextField phonefield;
    JButton button;
    userinfo(){
         namefield=new JTextField("NAME:");
         emailfield=new JTextField("EMAIL-ID:");
         phonefield=new JTextField("PHONE-NO:");
         button=new JButton("submit");
         button.addActionListener(this);
         namefield.setBounds(100, 50, 200, 30);
         emailfield.setBounds(100, 100, 200, 30);
         phonefield.setBounds(100, 150, 200, 30);
         button.setBounds(150, 200, 100, 40);
        
        this.setSize(500,500);
        this.setTitle("user information form");
        this.add(button);
        this.add(namefield);
        this.add(emailfield);
        this.add(phonefield);
        this.setLayout(null);
        this.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){

        
    }
    public static void main(String[] args) {
        userinfo frame=new userinfo();
    }
    
}
