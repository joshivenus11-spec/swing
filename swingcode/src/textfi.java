
import javax.swing.JFrame;
import javax.swing.JTextField;


public class textfi  extends JFrame{
    textfi(){
        JTextField field=new JTextField("im textfield");
        field.setBounds(100, 100, 200, 30);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(field);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        textfi frame=new textfi();
    }
    
}
