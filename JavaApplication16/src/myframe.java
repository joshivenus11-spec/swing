
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.plaf.ComboBoxUI;


public class myframe extends JFrame implements ActionListener {
    JComboBox box;
    myframe(){
         this.setSize(500, 500);
        this.setTitle("about radio button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        String[]animals={"cat","dog","bird"};
        box=new JComboBox(animals);
        box.addActionListener(this);
        System.out.println(box.getItemCount());
        box.addItem("horse");
        box.remove(0);
        box.insertItemAt("pig", 0);
       
        this.add(box);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==box){
            System.out.println(box.getSelectedItem());
        }
        
    }
    public static void main(String[] args) {
        myframe frame=new myframe();
    }
    
}
