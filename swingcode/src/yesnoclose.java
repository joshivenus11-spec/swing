
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class yesnoclose extends JFrame implements ActionListener {
    JButton yesbutton;
    JButton nobutton;
    JButton closebutton;
    JLabel label;
    
    yesnoclose(){
        yesbutton=new JButton("yes");
        nobutton=new JButton("no");
        closebutton=new JButton("close");
        yesbutton.addActionListener(this);
        nobutton.addActionListener(this);
        closebutton.addActionListener(this);
        label=new JLabel();
        this.setSize(500, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("about button");
        yesbutton.setBounds(100, 100, 100, 40);
nobutton.setBounds(220, 100, 100, 40);
closebutton.setBounds(160, 180, 100, 40);
label.setBounds(100, 250, 250, 30);
        this.add(yesbutton);
        this.add(nobutton);
        this.add(label);
        this.add(closebutton);
        this.setVisible(true);
    }
    public void actionPerformed (ActionEvent e){
        if(e.getSource()==yesbutton){
            label.setText("yes is pressed");
        }
        else if(e.getSource()==nobutton){
            label.setText("no is pressed");
        }
        else{
            this.dispose();
        }
        
    }
    public static void main(String[] args) {
        yesnoclose frame=new yesnoclose();
    }
            
    
}
