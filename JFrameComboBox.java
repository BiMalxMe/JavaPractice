
import javax.swing.*;

public class JFrameComboBox {

    public JFrameComboBox() {
        JFrame jf = new JFrame("Select Gender");

        jf.setBounds(100, 100, 300, 300);

        // Jcombobox contains multiple values so array is prefferred
        String[] genders = { "Male", "Female", "Others" };

        JComboBox genderComboBox = new JComboBox(genders);
        genderComboBox.setBounds(100, 100, 100, 30);

        jf.add(genderComboBox);


        jf.setSize(300, 300);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameComboBox();
    }
}
