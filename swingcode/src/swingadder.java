
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class swingadder  extends JFrame implements ActionListener{
    JTextField field1;
    JTextField field2;
    JTextField field3;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JButton addbtn;
    JButton clearbtn;
    swingadder(){
        field1=new JTextField();
         field2=new JTextField();
          field3=new JTextField();
          label1=new JLabel("enter first  number:");
           label2=new JLabel("enter second number:");
            label3=new JLabel("result:");
            addbtn=new JButton("add");
            addbtn.addActionListener(this);
            clearbtn=new JButton("clear");
            clearbtn.addActionListener(this);
            
            field1.setBounds(100, 50, 200, 30);
field2.setBounds(100, 100, 200, 30);
field3.setBounds(100, 150, 200, 30);

label1.setBounds(100, 200, 200, 30);
label2.setBounds(100, 240, 200, 30);
label3.setBounds(100, 280, 200, 30);

addbtn.setBounds(100, 330, 100, 40);
clearbtn.setBounds(220, 330, 100, 40);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("SWING ADDER");
        this.add(field1);
        this.add(field2);
        this.add(field3);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(addbtn);
        this.add(clearbtn);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addbtn){
            int num1=Integer.parseInt(field1.getText());
            int num2=Integer.parseInt(field2.getText());
            int result=num1+num2;
            field3.setText(String.valueOf(result));
        }
        else{
            field1.setText(" ");
             field2.setText(" ");
              field3.setText(" ");
        }
        
    }
    public static void main(String[] args) {
        swingadder frame=new swingadder();
    }
    
}
