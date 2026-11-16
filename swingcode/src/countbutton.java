
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class countbutton  extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    int count=0;
    countbutton(){
        label=new JLabel("button clicked 0 times");
     
        label.setBounds(150, 250, 200, 30);
        button=new JButton("click me");
        button.setBounds(150, 200, 100, 40);
        button.addActionListener(this);
        
        this.setSize(500,500);
        this.setTitle("counter for buuton click");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(label);
        this.add(button);
        this.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
      
        
        if(e.getSource()==button){
            count=count+1;
             label.setText("button clicked"+count+ " "+ "times");
             
        }
        
        
    }
    public static void main(String[] args) {
        countbutton frame=new countbutton();
    }
    
}
