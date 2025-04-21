import javax.swing.*;

public class radioBtnJframe {

    public radioBtnJframe() {
        JFrame jf = new JFrame("Select Gender");

        // check the male radio btn by default
        JRadioButton male = new JRadioButton("male",true);
        male.setBounds(100, 80, 100, 20);

        JRadioButton female = new JRadioButton("female");
        female.setBounds(100, 120, 100, 20);

        JRadioButton other = new JRadioButton("others");
        other.setBounds(100, 160, 100, 20);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(other);


        jf.add(male);
        jf.add(female);
        jf.add(other);


        jf.setSize(300, 300);

        // Custom layout dida null garnu parcha
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new radioBtnJframe();
    }
}
