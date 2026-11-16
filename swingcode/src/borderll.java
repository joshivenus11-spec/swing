
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class borderll extends JFrame  implements ActionListener{
    JButton button;
    JTextField field;
    JTextArea area;
    
    borderll(){
        button=new JButton("click me");
        button.addActionListener(this);
        
        field=new JTextField();
        area=new JTextArea();
        
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("append");
        this.setLayout(new BorderLayout());
        this.add(button,BorderLayout.SOUTH);
        this.add(field,BorderLayout.NORTH);
        this.add(area,BorderLayout.CENTER);
        this.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            String text=field.getText();
            area.append(text + "\n");
            field.setText(" ");
        }
        
    }
    public static void main(String[] args) {
        borderll frame=new borderll();
    }
    
}
