
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class myframe extends JFrame implements ActionListener {
    
   JRadioButton pizza;
   JRadioButton hamburger;
   JRadioButton hotdog;
    myframe(){
         pizza=new JRadioButton();
        hamburger=new JRadioButton("hamburger");
          hotdog=new JRadioButton("hotdog");
          pizza.addActionListener(this);
          hotdog.addActionListener(this);
          hamburger.addActionListener(this);
         ButtonGroup group=new ButtonGroup();
         group.add(pizza);
         group.add(hamburger);
         group.add(hotdog);
       
        this.setSize(500, 500);
        this.setTitle("about radio button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(pizza);
        this.add(hamburger);
        this.add(hotdog);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizza){
            System.out.println("you ordered pizza");
        }
        else if(e.getSource()==hamburger){
            System.out.println("you ordered hamburger");
            
        }
        else{
            System.out.println("you ordered hotdog");
        }
        
    }
    public static void main(String[] args) {
        myframe frame=new myframe();
    }
    
}
