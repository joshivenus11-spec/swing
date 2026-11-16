
import javax.swing.JFrame;


public class windowclose  extends JFrame{
    windowclose(){
         this.setSize(500, 500);
        
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SWING ADDER");
        this.setVisible(true);
        
    }
    public static void main(String[] args) {
        windowclose frame=new windowclose();
    }
    
}
