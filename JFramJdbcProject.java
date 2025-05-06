import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class JFramJdbcProject extends JFrame {

    public JFramJdbcProject() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));
        //adding the custom colors
        Color customColor = new Color(230, 230, 250);
        panel.setBackground(customColor);




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
        panel.add(submitButton);

        //adding the getdata btn to get the datas from the databaase

        JButton getData = new JButton("Get Datas");
        panel.add(getData);

        getData.addActionListener(e -> {
            //after clicking just disabling it
            getData.setEnabled(false);
             fetchDB();
             getData.setEnabled(true);
        });


        submitButton.addActionListener(e -> {
            //making the submit btn unable to work until the response comes from the db
            submitButton.setEnabled(false);
            System.out.println("Submit buttin clicked");
            System.out.flush();
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

            String message = String.format("Name %s\nEmail %s\nSubject %s\nGender %s\nPhone %s",
                    name, email, subject, gender, phone);
            JOptionPane.showMessageDialog(this, message, "Form Data", JOptionPane.INFORMATION_MESSAGE);

            // Only create table (no data insert)
            System.out.println("Initiating the database connectivitu Sending Datas");
            saveToDatabase(name,email,subject,gender,phone);

            //after response from dn comes reenable submitbtn
            submitButton.setEnabled(true);
        });

        add(panel);
        setSize(400, 300);
        setVisible(true);
    }
    public void saveToDatabase(String name,String email,String subject,String gender,String phone) {
        Connection con = null;
        Statement st = null;

        try {
            // Load PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Connect to NeonDB
            con = DriverManager.getConnection(
                    "jdbc:postgresql://ep-quiet-shadow-a4ajj1fn-pooler.us-east-1.aws.neon.tech/neondb?sslmode=require",
                    "neondb_owner",
                    "npg_nvDduab1Oeo9"
            );

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
            System.out.println(val + " Tables Created or Already Exist.");
            String insertQuery ="INSERT INTO student (name, email,subject,gender,phone) VALUES (?,?,?,?,?)";
           //helps tp put ddata to prevent from the sql injections
            PreparedStatement ps  = con.prepareStatement(insertQuery);
            //based on the args placement inserting the vals
            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,subject);
            ps.setString(4,gender);
            ps.setString(5,phone);
            int retVal = ps.executeUpdate();

            System.out.println( retVal + "Inserted");

            //make a good errir handling of data retrieval and insertion
            if(retVal == 1) {
                JOptionPane.showMessageDialog(this, "Data inserted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error inserting data!", "Error", JOptionPane.ERROR_MESSAGE);
            }


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void fetchDB(){

        //connecting to db
        Connection con = null;
        Statement st = null;

        try {
            // Load PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Connect to NeonDB
            con = DriverManager.getConnection(
                    "jdbc:postgresql://ep-quiet-shadow-a4ajj1fn-pooler.us-east-1.aws.neon.tech/neondb?sslmode=require",
                    "neondb_owner",
                    "npg_nvDduab1Oeo9"
            );

            st = con.createStatement();
            String selectQuery = "SELECT * FROM student";

            // Create a Statement object to execute the SQL query
            st = con.createStatement();

            // Execute the query and fetch rows
            ResultSet rs = st.executeQuery(selectQuery);
            StringBuilder finaldata =new StringBuilder() ;
            // Iterate through the result set and print each row's data
            while (rs.next()) {
                // Retrieve data from each column using column names (or column index)
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String subject = rs.getString("subject");
                String gender = rs.getString("gender");
                String phone = rs.getString("phone");

                // Print the student record
                String formattedString = String.format("\n id : %s\n Name: %s\nEmail: %s\nSubject: %s\nGender: %s\nPhone: %s\n",id , name, email, subject, gender, phone);
                    finaldata.append(formattedString);
            }JTextArea jta = new JTextArea(finaldata.toString(), 20, 40); // limitingn the rows and cols
            jta.setEditable(false); // prevent editing
            JScrollPane js = new JScrollPane(jta); // attaching scroll as there can be multiple vals

// Show in dialog
            JOptionPane.showMessageDialog(this, js, "Data Fetched Successfully!", JOptionPane.INFORMATION_MESSAGE);


        }catch (Exception e){
            System.out.println(e);
        }
    };


    public static void main(String[] args) {
        new JFramJdbcProject();
    }
}
