import java.awt.BorderLayout;
import javax.swing.*;

public class ShowBorderLayout extends JFrame {

    public ShowBorderLayout(){
        setLayout(new BorderLayout(5,10));

        add(new JButton("East"),BorderLayout.EAST);
        add(new JButton("South"),BorderLayout.SOUTH);
        add(new JButton("West"),BorderLayout.WEST);
        add(new JButton("North"),BorderLayout.NORTH);
        add(new JButton("Center"),BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        ShowBorderLayout frame = new ShowBorderLayout();
        frame.setTitle("Border Layout Example");
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
