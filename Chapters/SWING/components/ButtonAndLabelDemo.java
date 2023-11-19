
package components;

import javax.swing.*;
import java.awt.*;

class ButtonAndLabelDemo extends JFrame {
  ButtonAndLabelDemo(String s) {
    super(s);
    setVisible(true);
    setLayout(new FlowLayout(FlowLayout.CENTER));
    setSize(400, 400);

    JLabel lb1 = new JLabel("Enter your name");
    add(lb1);
    JTextField tf1 = new JTextField(40);
    add(tf1);

    JButton b1 = new JButton("Submit");
    add(b1);
  }

  public static void main(String[] args) {
    new ButtonAndLabelDemo("Button Example");
  }
}