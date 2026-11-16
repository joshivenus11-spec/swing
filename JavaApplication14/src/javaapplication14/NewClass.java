
package javaapplication14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
public class NewClass extends JFrame implements ActionListener{
     JCheckBox box;
     JButton button;
    NewClass(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
       button=new JButton();
       button.setText("submit");
       button.addActionListener(this);
        box=new JCheckBox();
        box.setText("workout");
        this.add(box);
        this.add(button);
         this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("completed"+" "+box.getText());
            button.setEnabled(false);
        }
    }
    public static void main(String[] args) {
      NewClass frame=new NewClass();
    }
    
    
}
