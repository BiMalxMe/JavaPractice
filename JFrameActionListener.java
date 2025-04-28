import javax.swing.*;
import java.awt.event.*;

public class JFrameActionListener implements ActionListener {

    //these vars should be in main class as the actionPerformed can access this
    JFrame frame;
    JButton button;

    // defining the constructor
    JFrameActionListener() {
        frame = new JFrame("Simple JFrame ActionListener Example");
        button = new JButton("Click Me");

        button.setBounds(100, 100, 120, 40);
        //this means the current btn obj
        button.addActionListener(this); // Registering ActionListener

        frame.add(button);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Action performed when button is clicked
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was clicked!");
    }

    // Main method
    public static void main(String[] args) {
        new JFrameActionListener();
    }
}
