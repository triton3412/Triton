import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing extends JFrame {
    public swing() {
        setTitle("AYAYAYAYAYAYAYAYAYAYAYAYAYAY");
        setVisible(true);
        setSize(500, 500);
        Button btn = new Button();
        Container c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.add(btn);
        btn.setVisible(true);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        swing frame = new swing();
    }
}
