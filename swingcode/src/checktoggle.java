
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class checktoggle  extends JFrame implements ActionListener{
    JLabel label;
    JCheckBox box;
    checktoggle(){
        label=new JLabel();
        box=new JCheckBox();
        label.setBounds(150, 150, 200, 30);
        box.addActionListener(this);
        box.setBounds(150, 100, 150, 30);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("visisbility ");
        this.add(label);
        this.add(box);
        label.setVisible(false);
        this.setVisible(true);
        
    }
    public void actionPerformed (ActionEvent e){
        if(box.isSelected()){
           
            label.setText("visible now");
             label.setVisible(true);
        }
        else{
            label.setVisible(false);
        }
        
    }
    public static void main(String[] args) {
        checktoggle frame=new checktoggle();
    }
    
}
