import java.awt.*;
import javax.swing.*;
public class DisplayClock extends JFrame {

    public DisplayClock() {
        StillClock clock = new StillClock();

        add(clock);
    }
    public static void main(String[] args) {

        DisplayClock frame = new DisplayClock();
        frame.setTitle("DisplayClock");
        frame.setSize(300,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}