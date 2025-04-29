import javax.swing.*;
import java.awt.*;

public class JFrameRegistrationForm extends JFrame {

    public JFrameRegistrationForm() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3rd argument is horizontal gap
        // 4th argument is vertical gap
        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));

        // name field
        panel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        panel.add(nameField);

        // email field
        panel.add(new JLabel("Email:"));
        JTextField emailField = new JTextField();
        panel.add(emailField);

        // subject combobox
        panel.add(new JLabel("Subject:"));
        String[] subjects = {"BCA", "BSc.CSIT", "BHM", "BIM"};
        JComboBox<String> subjectComboBox = new JComboBox<>(subjects);
        panel.add(subjectComboBox);

        // gender radio buttons
        panel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        JRadioButton otherButton = new JRadioButton("Other");
        //radio btn should be inside the btngroup
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        genderPanel.add(otherButton);
        panel.add(genderPanel);

        // phone number field
        panel.add(new JLabel("Phone Number:"));
        JTextField phoneField = new JTextField();
        panel.add(phoneField);

        // empty label for spacing
        panel.add(new JLabel(""));

        // submit button
        JButton submitButton = new JButton("Submit");

        // add event listener for submit button
        submitButton.addActionListener(e -> {
            // basic input validation
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String phone = phoneField.getText().trim();

            if (name.isEmpty() || email.isEmpty() || phone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // gender determination
            String gender = maleButton.isSelected() ? "Male" :
                    femaleButton.isSelected() ? "Female" :
                            otherButton.isSelected() ? "Other" : "Not selected";

            String subject = (String) subjectComboBox.getSelectedItem();

            // display the form data
            String message = String.format("Name: %s\nEmail: %s\nSubject: %s\nGender: %s\nPhone: %s",
                    name, email, subject, gender, phone);
            //shows dialogue accordin to the JpotionPane type
            JOptionPane.showMessageDialog(this, message, "Form Data", JOptionPane.INFORMATION_MESSAGE);
        });

        panel.add(submitButton);

        // add the main panel to the JFrame
        add(panel);

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameRegistrationForm();
    }
}
