import javax.swing.*;
//for all kind of the LayoutProperties
        import java.awt.*;

public class JFrameGridLayout extends JFrame {
    public JFrameGridLayout() {
        setTitle("GridLayout Example");


        //∂efining the btn
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        JButton btn6 = new JButton("Button 6");
        JButton btn7 = new JButton("Button 7");
        JButton btn8 = new JButton("Button 8");

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);

        setVisible(true);
        setSize(300, 200);

        //aligns automatically and options are
        // LEFT RIGHT LEADING CENTER TRAILING

        //DEFINIGN THE NEW OBJ
        GridLayout gl = new GridLayout(7,2);

        //SETTING UP THE LAYOUT
        setLayout(gl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameGridLayout();
    }
}
