
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class celtofar extends JFrame implements ActionListener {
    JButton button;
    JLabel label1;
    JLabel label2;
    JTextField field;
    celtofar(){
        button=new JButton("convert");
        button.addActionListener(this);
        
        field=new JTextField();
        
        label1=new JLabel("enter temperature in celsius");
        label2=new JLabel("Temperature in Fahrenhiet is:");
        label1.setBounds(100, 100, 200, 30);
field.setBounds(100, 140, 200, 30);
button.setBounds(150, 190, 100, 40);
label2.setBounds(100, 250, 250, 30);
        
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(button);
        this.add(label1);
        this.add(label2);
        this.add(field);
        this.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            double ctemp=Double.parseDouble(field.getText());
            double fahrenheit = (ctemp * 9 / 5) + 32;
            
            label2.setText("temperature in fahrenhiet is"+String.valueOf(fahrenheit));
        }
        
    }
    public static void main(String[] args) {
        celtofar frame=new celtofar();
    }
    
}
