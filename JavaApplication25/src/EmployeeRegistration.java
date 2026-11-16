import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeRegistration extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4, t5;
    JButton addButton, displayButton;

    Connection con;
    PreparedStatement pst;

    public EmployeeRegistration() {

        setTitle("Employee Registration System");
        setSize(500, 400);
        setLayout(new GridLayout(7, 2, 10, 10));

        l1 = new JLabel("Employee ID:");
        l2 = new JLabel("Name:");
        l3 = new JLabel("Department:");
        l4 = new JLabel("Designation:");
        l5 = new JLabel("Salary:");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();

        addButton = new JButton("Register Employee");
        displayButton = new JButton("Display All");

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(l4);
        add(t4);

        add(l5);
        add(t5);

        add(addButton);
        add(displayButton);

        addButton.addActionListener(this);
        displayButton.addActionListener(this);

        // Database connection
        try {
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/company?useSSL=false&allowPublicKeyRetrieval=true",
        "root",
        "Venus475"
    );
    JOptionPane.showMessageDialog(this, "Database Connected Successfully!");
} catch (ClassNotFoundException e) {
    JOptionPane.showMessageDialog(this, "JAR ERROR: MySQL Driver class not found!\n" + e.getMessage());
    e.printStackTrace();
} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "MYSQL ERROR: " + e.getMessage());
    e.printStackTrace();
}

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center window on screen
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Connection Guard: Prevents NullPointerException if DB fails to connect
        if (con == null) {
            JOptionPane.showMessageDialog(this, 
                    "No active database connection!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (e.getSource() == addButton) {

            try {
                // Input validation check
                if (t1.getText().trim().isEmpty() || t2.getText().trim().isEmpty() || t5.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please fill in all required fields!");
                    return;
                }

                // Explicit column naming prevents schema positioning errors
                String sql = "INSERT INTO employee (emp_id, name, department, designation, salary) VALUES (?, ?, ?, ?, ?)";

                pst = con.prepareStatement(sql);

                pst.setInt(1, Integer.parseInt(t1.getText().trim()));
                pst.setString(2, t2.getText().trim());
                pst.setString(3, t3.getText().trim());
                pst.setString(4, t4.getText().trim());
                pst.setDouble(5, Double.parseDouble(t5.getText().trim()));

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,
                        "Employee Registered Successfully");

                // Clear input fields
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Input Error: ID must be an integer and Salary must be a number!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        "Error: " + ex.getMessage());
            }
        }

        if (e.getSource() == displayButton) {

            try {
                Statement st = con.createStatement();

                ResultSet rs = st.executeQuery("SELECT * FROM employee");

                StringBuilder data = new StringBuilder();

                data.append("ID\tName\tDepartment\tDesignation\tSalary\n");
                data.append("------------------------------------------------------------\n");

                while (rs.next()) {
                    data.append(rs.getInt("emp_id")).append("\t");
                    data.append(rs.getString("name")).append("\t");
                    data.append(rs.getString("department")).append("\t");
                    data.append(rs.getString("designation")).append("\t");
                    data.append(rs.getDouble("salary")).append("\n");
                }

                JTextArea area = new JTextArea(data.toString());
                area.setEditable(false);

                JOptionPane.showMessageDialog(this,
                        new JScrollPane(area),
                        "All Employee Details",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        "Error: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Runs GUI on the Event Dispatch Thread safely
        SwingUtilities.invokeLater(() -> new EmployeeRegistration());
    }
}


