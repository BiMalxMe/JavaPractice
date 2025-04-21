import javax.swing.*;

public class JFrameDemo {

    public JFrameDemo() {
        JFrame jf = new JFrame("Login Form");

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(40, 80, 100, 20);

        JTextField t = new JTextField();
        t.setBounds(180, 80, 100, 20);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(40, 140, 100, 20);

        JPasswordField p = new JPasswordField();
        p.setBounds(180, 140, 100, 20);

        JButton submit = new JButton("Submit");
        submit.setBounds(100, 200, 100, 30);

        jf.add(l1);
        jf.add(t);
        jf.add(l2);
        jf.add(p);
        jf.add(submit);

        jf.setSize(400, 350);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameDemo();
    }
}
