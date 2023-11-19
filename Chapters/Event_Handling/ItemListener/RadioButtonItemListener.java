package ItemListener;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class RadioButtonItemListener extends JFrame implements ItemListener {
  JRadioButton rb1, rb2, rb3;
  JLabel l1;

  RadioButtonItemListener() {
    setVisible(true);
    setSize(200, 200);
    setLayout(new FlowLayout());

    l1 = new JLabel();
    add(l1);

    ButtonGroup gb = new ButtonGroup();
    rb1 = new JRadioButton("Veg");
    rb2 = new JRadioButton("Non - Veg");
    rb3 = new JRadioButton("Both");

    gb.add(rb3);
    gb.add(rb2);
    gb.add(rb1);
    add(rb1);
    add(rb2);
    add(rb3);

    rb1.addItemListener(this);
    rb2.addItemListener(this);
    rb3.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent ie) {
    if (ie.getStateChange() == 1) {
      if (ie.getSource() == rb1) {
        l1.setText("You choose vegetarion");
      } else if (ie.getSource() == rb2) {
        l1.setText("You choose non-vegetarion");
      } else if (ie.getSource() == rb3) {
        l1.setText("You choose both");
      }
    }
  }

  public static void main(String[] args) {
    new RadioButtonItemListener();
  }
}
