
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class myframe extends JFrame implements ActionListener {
    JMenuItem newItem, openItem, exitItem; JMenuItem cutItem, copyItem, pasteItem; JMenuItem aboutItem;
    myframe(){
        JMenuBar bar=new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("edit");
        JMenu helpMenu = new JMenu("help");
          
          newItem = new JMenuItem("New"); 
          openItem = new JMenuItem("Open"); 
          exitItem = new JMenuItem("Exit");
        
          cutItem = new JMenuItem("Cut"); 
          copyItem = new JMenuItem("Copy");
          pasteItem = new JMenuItem("Paste");
        
          aboutItem = new JMenuItem("About");
fileMenu.add(newItem); 
fileMenu.add(openItem);
fileMenu.add(exitItem); 

editMenu.add(cutItem);
editMenu.add(copyItem);
editMenu.add(pasteItem);
helpMenu.add(aboutItem);
menuBar.add(fileMenu); 
menuBar.add(editMenu);
menuBar.add(helpMenu); 
          
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
    }
    public static void main(String[] args) {
        myframe frame=new myframe();
    }
    
}
