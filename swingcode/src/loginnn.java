
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//Create a complete Swing application that implements a simple login screen.
//The GUI should have fields for username and password (with hidden input), and a "Login" button.
//When clicked, check if both fields are "admin" and display a success/failure message in a dialog box.
public class loginnn  extends JFrame implements ActionListener{
    JLabel label1;
    JLabel label2;
    JTextField field1;
   JPasswordField field2 ;
    JButton button;
    loginnn(){
        label1=new JLabel("ennter username");
        label2=new JLabel("enter password");
        field1=new JTextField();
        field2=new JPasswordField();
        button=new JButton("submit");
        button.addActionListener(this);
         this.setSize(500, 500);
        this.setTitle("login form");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        label1.setBounds(100, 50, 120, 30);
field1.setBounds(100, 80, 200, 30);

label2.setBounds(100, 130, 120, 30);
field2.setBounds(100, 160, 200, 30);

button.setBounds(150, 220, 100, 40);
        this.add(label1);
        this.add(label2);
        this.add(field1);
        this.add(field2);
        this.add(button);
        this.setVisible(true);
        
    }
   public void actionPerformed(ActionEvent e) {
    if(e.getSource() == button) {

        String name = field1.getText();
        String password = new String(field2.getPassword());

        if(name.equals("admin") && password.equals("admin")) {
            JOptionPane.showMessageDialog(null,
                    "submitted",
                    "title",
                    JOptionPane.PLAIN_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "not submitted",
                    "title",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }
}
        
    
    public static void main(String[] args) {
        loginnn frame=new loginnn();
    }
    
}
