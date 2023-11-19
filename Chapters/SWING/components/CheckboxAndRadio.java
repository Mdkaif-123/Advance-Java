package components;

import javax.swing.*;
import java.awt.*;

class CheckboxAndRadio extends JFrame {
  CheckboxAndRadio() {
    setVisible(true);
    setLayout(new FlowLayout(FlowLayout.CENTER));
    setSize(400, 200);

    JCheckBox cb1 = new JCheckBox("Apple");
    JCheckBox cb2 = new JCheckBox("Banana");
    JCheckBox cb3 = new JCheckBox("Orange");
    JCheckBox cb4 = new JCheckBox("Mango");
    add(cb1);
    add(cb2);
    add(cb3);
    add(cb4);

    JRadioButton rb1 = new JRadioButton("Male");
    JRadioButton rb2 = new JRadioButton("Female");
    JRadioButton rb3 = new JRadioButton("Others");

    ButtonGroup bg = new ButtonGroup();

    bg.add(rb1);
    bg.add(rb2);
    bg.add(rb3);

    add(rb1);
    add(rb2);
    add(rb3);
  }

  public static void main(String[] args) {
    new CheckboxAndRadio();
  }
}
