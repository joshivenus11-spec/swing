
import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class itemeve  extends JFrame implements ItemListener{
    JLabel label;
    Choice choice;
    itemeve(){
        choice=new Choice();
        choice.add("java");
        choice.add("python");
        choice.add("c++");
         label = new JLabel("Select Subject Choice");
        choice.addItemListener(this);
        choice.setBounds(100, 100, 150, 30);
        label.setBounds(100, 150, 200, 30);
        this.setSize(500, 500);
        this.setTitle("about item listner");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(choice);
        this.add(label);
        this.setVisible(true);
    }
    public void itemStateChanged (ItemEvent e){
       label.setText(choice.getSelectedItem());
        
    }
    public static void main(String[] args) {
        itemeve frame=new itemeve();
    }

}
