import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginf extends JFrame implements ActionListener {

    JTextField usernamefield;
    JPasswordField passwordfield;
    JButton button;

    loginf() {

        usernamefield = new JTextField("enter username");
        passwordfield = new JPasswordField("enter password");

        // Show "enter password" normally
        passwordfield.setEchoChar((char) 0);

        button = new JButton("login button");

        button.addActionListener(this);

        usernamefield.setBounds(100, 100, 200, 30);
        passwordfield.setBounds(100, 150, 200, 30);
        button.setBounds(150, 200, 100, 40);

        this.setSize(500, 500);
        this.setTitle("login form");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        this.add(usernamefield);
        this.add(passwordfield);
        this.add(button);

        // Username placeholder
        usernamefield.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (usernamefield.getText().equals("enter username")) {
                    usernamefield.setText("");
                }
            }
        });

        // Password placeholder
        passwordfield.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (passwordfield.getText().equals("enter password")) {
                    passwordfield.setText("");
                    passwordfield.setEchoChar('•');
                }
            }
        });

        this.setVisible(true);
        button.requestFocusInWindow();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {

            String name = usernamefield.getText();
            String password = new String(passwordfield.getPassword());

            if (name.equals("admin") && password.equals("1234")) {

                JOptionPane.showMessageDialog(
                    null,
                    "login successful"
                );

            } else {

                JOptionPane.showMessageDialog(
                    null,
                    "invalid username or password"
                );
            }
        }
    }

    public static void main(String[] args) {
        loginf frame = new loginf();
    }
}
