import javax.swing.*;
import java.awt.*;

public class JFrameFlowLayout extends JFrame {
    public JFrameFlowLayout() {
        setTitle("FlowLayout Example");


        //∂efining the btn
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);

        setVisible(true);
        setSize(300, 200);

        //aligns automatically and options are
        // LEFT RIGHT LEADING CENTER TRAILING

        //DEFINIGN THE NEW OBJ
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);

        //SETTING UP THE LAYOUT
        setLayout(fl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameFlowLayout();
    }
}
