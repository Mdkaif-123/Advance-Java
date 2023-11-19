package ItemListener;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ItemListenerExample extends JFrame implements ItemListener {

  JCheckBox cb1, cb2;
  JLabel l1, l2;

  ItemListenerExample() {
    setVisible(true);
    setSize(200, 200);
    setLayout(new FlowLayout());

    cb1 = new JCheckBox("JAVA");
    cb2 = new JCheckBox("CPP");

    add(cb1);
    add(cb2);

    l1 = new JLabel();
    l2 = new JLabel();
    add(l1, FlowLayout.CENTER);
    add(l2, FlowLayout.CENTER);
    cb1.addItemListener(this);
    cb2.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent ae) {

    if (ae.getSource() == cb1) {
      l1.setText("JAVA " +
          (ae.getStateChange() == 1 ? "Checked" : "Unchecked"));

    } else if (ae.getSource() == cb2) {
      l2.setText("CPP " +
          (ae.getStateChange() == 1 ? "Checked" : "Unchecked"));
    }
  }

  public static void main(String[] args) {
    new ItemListenerExample();
  }
}
