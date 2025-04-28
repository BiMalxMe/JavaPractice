
package Swing;

import javax.swing.*;
        import java.awt.event.*;

public class JFrameMouseListener extends JFrame implements MouseListener {
    JLabel label;

    JFrameMouseListener() {
        label = new JLabel("Demo Java");
        label.setBounds(20, 50, 200, 20);

        add(label);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //adding the mouse listener
        addMouseListener(this);
    }
//when the mouse is clicked in the Jframe
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }
//hovered
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }
//out from the jframe
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }
//on click
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }
//drag and then dropped then it envokes
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public static void main(String[] args) {
        new JFrameMouseListener();
    }
}
