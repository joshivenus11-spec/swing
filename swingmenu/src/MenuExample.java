
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuExample extends JFrame implements ActionListener {

    JMenuItem newItem, openItem, exitItem;
    JMenuItem cutItem, copyItem, pasteItem;
    JMenuItem aboutItem;

    MenuExample() {

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

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

        setJMenuBar(menuBar);

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        exitItem.addActionListener(this);
        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        aboutItem.addActionListener(this);

        setTitle("Menu Example");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newItem) {
            JOptionPane.showMessageDialog(this, "New File Selected");
        }
        else if (e.getSource() == openItem) {
            JOptionPane.showMessageDialog(this, "Open File Selected");
        }
        else if (e.getSource() == exitItem) {
            System.exit(0);
        }
        else if (e.getSource() == cutItem) {
            JOptionPane.showMessageDialog(this, "Cut Selected");
        }
        else if (e.getSource() == copyItem) {
            JOptionPane.showMessageDialog(this, "Copy Selected");
        }
        else if (e.getSource() == pasteItem) {
            JOptionPane.showMessageDialog(this, "Paste Selected");
        }
        else if (e.getSource() == aboutItem) {
            JOptionPane.showMessageDialog(
                this,
                "This is a Java Swing Menu Program"
            );
        }
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
