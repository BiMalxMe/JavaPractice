import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class JFramJdbcProject extends JFrame {

    public JFramJdbcProject() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));

        panel.add(new JLabel("Name"));
        JTextField nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Email"));
        JTextField emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Subject"));
        String[] subjects = {"BCA", "BSc.CSIT", "BHM", "BIM"};
        JComboBox<String> subjectComboBox = new JComboBox<>(subjects);
        panel.add(subjectComboBox);

        panel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        JRadioButton otherButton = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        genderPanel.add(otherButton);
        panel.add(genderPanel);

        panel.add(new JLabel("Phone Number"));
        JTextField phoneField = new JTextField();
        panel.add(phoneField);

        panel.add(new JLabel("")); // Spacer
        JButton submitButton = new JButton("Submit");
        System.out.println("Submit btn clicked");
        panel.add(submitButton);

        submitButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String phone = phoneField.getText().trim();

            if (name.isEmpty() || email.isEmpty() || phone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String gender;
            if (maleButton.isSelected()) {
                gender = "Male";
            } else if (femaleButton.isSelected()) {
                gender = "Female";
            } else if (otherButton.isSelected()) {
                gender = "Other";
            } else {
                gender = "Not selected";
            }

            String subject = (String) subjectComboBox.getSelectedItem();

            String message = String.format("Name: %s\nEmail: %s\nSubject: %s\nGender: %s\nPhone: %s",
                    name, email, subject, gender, phone);
            JOptionPane.showMessageDialog(this, message, "Form Data", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(message);

            // Save to PostgreSQL DB
            saveToDatabase(name, email, subject, gender, phone);
        });

        add(panel);
        setSize(400, 300);
        setVisible(true);
    }

    public void saveToDatabase(String name, String email, String subject, String gender, String phone) {
        System.out.println("HI from the db fn");
        Connection con = null;
        Statement st = null;

        try {
            // Load PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // NeonDB PostgreSQL connection string
            String url = "jdbc:postgresql://ep-quiet-shadow-a4ajj1fn-pooler.us-east-1.aws.neon.tech/neondb?sslmode=require";
            String user = "neondb_owner";
            String password = "npg_nvDduab1Oeo9";


            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();

            // Create table if not exists
            String createTableSQL = "CREATE TABLE IF NOT EXISTS student (" +
                    "id SERIAL PRIMARY KEY, " +
                    "name VARCHAR(100), " +
                    "email VARCHAR(100), " +
                    "subject VARCHAR(50), " +
                    "gender VARCHAR(10), " +
                    "phone VARCHAR(20))";
            int val = st.executeUpdate(createTableSQL);
            System.out.println("CREATE TABLE result: " + val); // likely prints 0


            // Insert data
            String query = "INSERT INTO student(name, email, subject, gender, phone) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, subject);
                ps.setString(4, gender);
                ps.setString(5, phone);

                int rowsInserted = ps.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data saved to NeonDB!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error closing resources: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new JFramJdbcProject();
    }
}
