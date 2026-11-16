
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class clearbutton extends JFrame implements ActionListener {
    JButton displaybtn;
    JButton clearbtn;
    JTextField field;
   clearbutton(){
       displaybtn=new JButton("display");
       displaybtn.addActionListener(this);
       clearbtn=new JButton("clear");
       clearbtn.addActionListener(this);
       
       field=new JTextField();
       field.setBounds(100, 100, 250, 30);
displaybtn.setBounds(100, 160, 100, 40);
clearbtn.setBounds(220, 160, 100, 40);
       this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("button math");
        this.add(field);
        this.add(displaybtn);
        this.add(clearbtn);
        
      
        this.setVisible(true);
       
   }
   public void actionPerformed(ActionEvent e){
       if(e.getSource()==displaybtn){
           field.setText("hello");
       }
       else{
           field.setText(" ");
       }
       
       
    
       
       
   }
    public static void main(String[] args) {
        clearbutton frame=new clearbutton();
    }
    
    
}
