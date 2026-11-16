
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class itemcom extends JFrame implements ItemListener {
    JCheckBox box1;
        JCheckBox box2;
        JLabel label;
    itemcom(){
        label=new JLabel("choose lang ");
        label.setBounds(100, 200, 250, 30);
        box1=new JCheckBox("java");
        box1.addItemListener(this);
        box2=new JCheckBox("python");
        box2.addItemListener(this);
        box1.setBounds(100, 100, 100, 30);
box2.setBounds(100, 150, 100, 30);
        this.setSize(500,500);
        this.setTitle("about item listner");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(label);
        this.add(box1);
        this.add(box2);
        this.setVisible(true);
        
    }
    public void itemStateChanged (ItemEvent e){
        String text="selected language";
        if(box1.isSelected()){
            text=text+box1.getText();
        }
        if (box2.isSelected()){
            text=text+box2.getText();
        }
        label.setText(text);
        
    }
    public static void main(String[] args) {
        itemcom frame=new itemcom();
    }
    
}
