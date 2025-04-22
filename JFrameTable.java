import javax.swing.*;

public class JFrameTable extends JFrame {
    public JFrameTable() {

        JLabel l = new JLabel("Student Info Table");
        l.setBounds(100, 20, 200, 30);

        //Arrnaging the heading elements
        String col[] = { "ID", "Name", "Address" };

        //arranging the content elements
        String data[][] = {
                { "1", "Ram", "Gaindakot" },
                { "2", "Shyam", "Pokhara" },
                { "3", "Sita", "Kathmandu" }
        };

        JTable jt = new JTable(data, col);

        //adding the scroll effect
        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(50, 60, 300, 80);

        add(l);
        add(sp);

        setSize(400, 200);
        setLayout(null);
        setVisible(true);

        //prevent running from the background
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameTable();
    }
}
