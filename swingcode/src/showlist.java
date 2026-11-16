
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;


public class showlist extends JFrame {
    showlist(){
        DefaultListModel<String>list=new DefaultListModel<>();
        list.addElement("ram");
        list.addElement("shyam");
         JList<String> myList = new JList<>(list);
        myList.setBounds(100, 100, 110, 110);
        
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("about jlist");
        this.setLayout(null);
        this.add(myList);
        this.setVisible(true);
        
    }
    public static void main(String[] args) {
        showlist frame=new showlist();
    }
    
}
