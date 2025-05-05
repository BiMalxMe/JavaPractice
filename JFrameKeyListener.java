import javax.swing.*;
import java.awt.event.*;

public class JFrameKeyListener implements KeyListener {

    JLabel statusLabel;

    JFrameKeyListener() {
        JFrame frame = new JFrame("KeyListener Example");

        // Creating a label to display key events
        statusLabel = new JLabel("Press any key");
        statusLabel.setBounds(50, 50, 250, 30);

        // Adding components to the frame
        frame.add(statusLabel);

        // KeyListener registration
        frame.addKeyListener(this);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setFocusable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Implementing KeyListener methods
    public void keyTyped(KeyEvent e) {
        statusLabel.setText("Key Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        String keyText = KeyEvent.getKeyText(e.getKeyCode());
        statusLabel.setText("Key Pressed: " + keyText + " (code: " + e.getKeyCode() + ")");
    }

    public void keyReleased(KeyEvent e) {
        String keyText = KeyEvent.getKeyText(e.getKeyCode());
        statusLabel.setText("Key Released: " + keyText);
    }

    public static void main(String[] args) {
        new JFrameKeyListener();
    }
}