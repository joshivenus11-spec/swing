
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class myframe extends JFrame implements ActionListener{//this frame will now listen for events
    JButton button;
    JLabel label;
   myframe(){
       label=new JLabel();
       label.setText("i poo");
       label.setBounds(150, 250, 150, 150);
       label.setVisible(false);
       button=new JButton();
       button.setBounds(200,100,100,50);
       button.setText("i am a button");
       button.setBackground(Color.red);
       button.addActionListener(this);
       button.setFocusable(false);
       button.setHorizontalTextPosition(JButton.CENTER);
       button.setVerticalTextPosition(JButton.CENTER);
       //button.setEnabled(false);//this will disable a button
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("this is about buttons");
        this.setLayout(null);
        this.add(button);
        this.add(label);
        
        this.setVisible(true);
   }
  
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("poooo");
            //button.setEnabled(false);//would work once and then disable 
            label.setVisible(true);
            
        }

    }
    public static void main(String[] args) {
        myframe obj=new myframe();
       
    }
    
}
