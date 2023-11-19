package AWT.components.layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CardLayoutExample extends JFrame implements ActionListener {

  CardLayout card;
  Container c;
  JButton b1, b2, b3;

  CardLayoutExample() {
    c = getContentPane();
    card = new CardLayout(10, 10);
    c.setLayout(card);

    b1 = new JButton("First");
    b2 = new JButton("Second");
    b3 = new JButton("Third");

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

    c.add("a", b1);
    c.add("b", b2);
    c.add("c", b3);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    card.next(c);
  }

  public static void main(String[] args) {
    CardLayoutExample c1 = new CardLayoutExample();
    c1.setVisible(true);
    c1.setSize(200, 300);
  }
}
