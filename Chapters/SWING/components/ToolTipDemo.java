package components;

import java.awt.FlowLayout;
import javax.swing.*;

public class ToolTipDemo extends JFrame {
  ToolTipDemo() {
    setVisible(true);
    setLayout(new FlowLayout());
    setSize(200, 200);

    JLabel l1 = new JLabel("Enter your details");
    JTextField t1 = new JTextField(20);
    JTextField t2 = new JTextField(20);

    t1.setToolTipText("Enter your Username");
    t2.setToolTipText("Enter your Password");
    add(l1);
    add(t1);
    add(t2);
  }

  public static void main(String[] args) {
    new ToolTipDemo();
  }
}