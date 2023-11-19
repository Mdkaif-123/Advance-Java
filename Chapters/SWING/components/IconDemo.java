package components;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IconDemo extends JFrame {
  IconDemo() {
    setVisible(true);
    setLayout(new BorderLayout());
    setSize(400, 200);

    ImageIcon ic = new ImageIcon("C:\\Users\\Md Kaif Ansari\\OneDrive\\Pictures\\Avatar\\demo.jpg");
    JLabel l1 = new JLabel("Kaif", ic, JLabel.CENTER);

    add(l1);
  }

  public static void main(String[] args) {
    new IconDemo();
  }
}
