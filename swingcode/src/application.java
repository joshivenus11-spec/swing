
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class application  extends JFrame implements ActionListener{
    JTextArea area;
    JTextField field;
    JButton button;
    JList< String>list;
    application(){
        area=new JTextArea();
        field=new JTextField();
        button=new JButton("send");
        button.addActionListener(this);
        String[]onlineusers={"ram","shyam","neha","prerna"};
        JList<String>list=new JList<>(onlineusers);
        area.setBounds(50, 50, 300, 250);
field.setBounds(50, 320, 300, 30);
button.setBounds(360, 320, 80, 30);
list.setBounds(360, 50, 100, 250);
        this.setSize(500, 500);
        this.setTitle("chhating interface");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(area);
        this.add(field);
        this.add(button);
        this.add(list);
        this.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            String text=field.getText();
            area.append(text +"\n");
            field.setText(" ");
        }
        
    }
   
    public static void main(String[] args) {
        application frame=new application();
    }
    
}
