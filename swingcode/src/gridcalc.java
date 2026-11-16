
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class gridcalc  extends JFrame implements ActionListener{
    JButton button1;
    JTextField field1;
    JTextField field2;
    JButton button2;
    JButton button3;
    JButton button4;
    JLabel label;
    gridcalc(){
        field1=new JTextField();
        field2=new JTextField();
        label=new JLabel("result :");
        button1=new JButton("add");
        button2=new JButton("subtract");
        button3=new JButton("multiply");
        button4=new JButton("divide");
        this.setSize(500, 500);
        this.setTitle("calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4,2));
        button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(label);
        this.add(field1);
        this.add(field2);
        this.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){
            int num1=Integer.parseInt(field1.getText());
            int num2=Integer.parseInt(field2.getText());
            int result=num1+num2;
            label.setText(String.valueOf(result));
            
        }
         
        if(e.getSource()==button2){
            int num1=Integer.parseInt(field1.getText());
            int num2=Integer.parseInt(field2.getText());
            int result=num1-num2;
            label.setText(String.valueOf(result));
            
        }
        if(e.getSource()==button3){
            int num1=Integer.parseInt(field1.getText());
            int num2=Integer.parseInt(field2.getText());
            int result=num1*num2;
            label.setText(String.valueOf(result));
            
        }
        if(e.getSource()==button4){
            int num1=Integer.parseInt(field1.getText());
            double num2=Double.parseDouble(field2.getText());
            double result=num1/num2;
            label.setText(String.valueOf(result));
            
        }
    }
    public static void main(String[] args) {
        gridcalc frame=new gridcalc();
    }
    
}
