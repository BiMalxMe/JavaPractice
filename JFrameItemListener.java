
import javax.swing.*;
        import java.awt.event.*;

public class JFrameItemListener implements ItemListener {

    JCheckBox checkBox;

    JFrameItemListener() {
        JFrame frame = new JFrame("ItemListener");

        // Creating a checkbox
        checkBox = new JCheckBox("Accept Terms and Conditions");
        checkBox.setBounds(50, 50, 250, 30);


        //  ItemListener obj register
        checkBox.addItemListener(this);

        frame.add(checkBox);

        frame.setSize(300, 150);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Implementing itemStateChanged method
    public void itemStateChanged(ItemEvent e) {
        // Checking if the checkbox is selected or deselected
        if (e.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("Checkbox is selected");
        } else if (e.getStateChange() == ItemEvent.DESELECTED) {
            System.out.println("Checkbox is deselected");
        }
    }

    public static void main(String[] args) {
        new JFrameItemListener();
    }
}
