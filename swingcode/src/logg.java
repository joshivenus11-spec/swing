
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class logg  extends JFrame implements ActionListener{
    JTextField field1;
    JTextField field2;
    JButton button;
    JLabel label;
    logg(){
        button =new JButton("submit");
        button.addActionListener(this);
        this.setSize(500, 500);
        
        field1=new JTextField();
        field2=new JTextField();
        
        label=new JLabel();
        field1.setBounds(100, 100, 200, 30);
field2.setBounds(100, 150, 200, 30);
button.setBounds(150, 200, 100, 40);
label.setBounds(100, 260, 250, 30);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("login form");
        this.setLayout(null);
        this.add(button);
        this.add(field1);
        this.add(field2);
        this.add(label);
        this.setVisible(true);
    }
    public void actionPerformed (ActionEvent e){
        if(e.getSource()==button){
         String name=field1.getText();
         int password=Integer.parseInt(field2.getText());
         if(name.equals("admin")&& password==1234){
             label.setText("login status:"+"SUCCESSFUL");
         }
         else{
             label.setText("login status:"+"FAILED");
         }
            
        }
        
    }
    public static void main(String[] args) {
        logg frame=new logg();
    }
    
}
