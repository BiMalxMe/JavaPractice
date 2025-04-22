import javax.swing.*;
import java.awt.*;

public class JFrameBorderLayout extends JFrame {
    public JFrameBorderLayout() {

        //manually sets the title
        setTitle("BorderLayout Example");
        setSize(300, 200);


        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("Center"), BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameBorderLayout();
    }
}
