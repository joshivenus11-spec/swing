
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class mixall extends JFrame implements ActionListener {
    JTextField field;
    JRadioButton button1;
    JRadioButton button2;
    JCheckBox box1;
    JCheckBox box2;
    JTextArea area;
    JComboBox box;
    JLabel label1;
     JLabel label2;
      JLabel label3;
       JLabel label4;
        JLabel label5;
        JButton subbtn;
        JButton exitbtn;
        mixall(){
            String[]countries={"bangladesh","france","india"};
            box=new JComboBox(countries);
            label1=new JLabel("name");
            label2=new JLabel("gender");
            label3=new JLabel("interest");
            label4=new JLabel("favourite place");
            label5=new JLabel("details");
            subbtn=new JButton("submit");
            subbtn.addActionListener(this);
            exitbtn=new JButton("exit");
            exitbtn.addActionListener(this);
            field=new JTextField();
            area=new JTextArea();
            box1=new JCheckBox("music");
            box2=new JCheckBox("swimming");
            button1=new JRadioButton("male");
            button2=new JRadioButton("female");
            ButtonGroup group=new ButtonGroup();
            group.add(button1);
            group.add(button2);
            this.setSize(500,500);
            this.setTitle("overall detail");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            
            label1.setBounds(50, 50, 120, 30);
label2.setBounds(50, 100, 120, 30);
label3.setBounds(50, 150, 120, 30);
label4.setBounds(50, 200, 120, 30);
label5.setBounds(50, 250, 120, 30);
box.setBounds(180, 200, 200, 30);

field.setBounds(180, 50, 200, 30);
area.setBounds(180, 250, 200, 100);

button1.setBounds(180, 100, 80, 30);
button2.setBounds(280, 100, 100, 30);

box1.setBounds(180, 150, 80, 30);
box2.setBounds(280, 150, 100, 30);

subbtn.setBounds(120, 380, 100, 35);
exitbtn.setBounds(260, 380, 100, 35);
            this.add(button1);
            this.add(button2);
            this.add(box1);
            this.add(box2);
            this.add(area);
            this.add(label1);
            this.add(label2);
            this.add(label3);
            this.add(label4);
            this.add(label5);
            this.add(subbtn);
            this.add(exitbtn);
            this.add(box);
            this.setVisible(true);
        }
        public void actionPerformed(ActionEvent e){
            
        }
        public static void main(String[] args) {
        mixall frame=new mixall();
    }
    
    
}
