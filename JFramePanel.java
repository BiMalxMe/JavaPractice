import javax.swing.*;
import java.awt.*;

// panel helps to add multiple values in the same portions
public class JFramePanel extends JFrame {
    public JFramePanel() {

        //before adding we should set the layout and all
        setLayout(new BorderLayout());
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel and set a layout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Add buttons to the panel
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        //add multiple btns in the center
        panel.add(button1);
        panel.add(button2);

        //give a panel borderlayout center
        add(panel, BorderLayout.CENTER);

        setVisible(true); // Make frame visible at the end
    }

    public static void main(String[] args) {
        new JFramePanel();
    }
}
