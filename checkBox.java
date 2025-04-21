import javax.swing.*;

public class checkBox {

    public checkBox() {
        JFrame jf = new JFrame("Select Languages");

        JCheckBox rust = new JCheckBox("Rust");
        rust.setBounds(100, 80, 100, 20);

        JCheckBox java = new JCheckBox("Java");
        java.setBounds(100, 120, 100, 20);

        JCheckBox python = new JCheckBox("Python");
        python.setBounds(100, 160, 100, 20);


        jf.add(rust);
        jf.add(java);
        jf.add(python);

        jf.setSize(300, 300);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new checkBox();
    }
}
