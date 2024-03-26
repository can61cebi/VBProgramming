import java.awt.*;
import javax.swing.*;
public class SixFlags extends JFrame{
    public SixFlags() {
    Image image1 = new ImageIcon("us.gif").getImage();
    Image image2 = new ImageIcon("ca.gif").getImage();

    Image image3 = new ImageIcon("fr.gif").getImage();
    Image image4 = new ImageIcon("china.gif").getImage();
    Image image5 = new ImageIcon("turkey.gif").getImage();
    Image image6 = new ImageIcon("uk.gif").getImage();

    setLayout(new GridLayout(1,0,5,5));
    add(new ImageViewer(image1));
    add(new ImageViewer(image2));
    add(new ImageViewer(image3));
    add(new ImageViewer(image4));
    add(new ImageViewer(image5));
    add(new ImageViewer(image6));
}
public static void main(String[] args) {

    SixFlags frame = new SixFlags();
    frame.setTitle("Flags");
    frame.setSize(400,300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
}