import javax.swing.*;
import java.awt.*;

public class JFrameRegistrationForm extends JFrame {

    public JFrameRegistrationForm() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3rd argument is horizontal gap
        //4th argument is vertical gap
        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));


        panel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        panel.add(nameField);

        // Email
        panel.add(new JLabel("Email:"));
        JTextField emailField = new JTextField();
        panel.add(emailField);

        // Subject
        panel.add(new JLabel("Subject:"));
        String[] subjects = {"BCA", "BSc.CSIT", "BHM", "BIM"};
        JComboBox subjectComboBox = new JComboBox(subjects);
        panel.add(subjectComboBox);

        // Gender
        panel.add(new JLabel("Gender:"));

        //inside the cell allocated after the gmail
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));

        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        JRadioButton otherButton = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();

        //adding into the gender cell
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        genderPanel.add(otherButton);

        //add the whole generderpanel to the main panel
        panel.add(genderPanel);

        // Phone number
        panel.add(new JLabel("Phone Number:"));
        JTextField phoneField = new JTextField();
        panel.add(phoneField);

        // Giving some space for aligning the sublit btn in the center
        panel.add(new JLabel(""));

        // SUBMIT
        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        //add the main panel to the JFrame
        add(panel);

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameRegistrationForm();
    }
}
