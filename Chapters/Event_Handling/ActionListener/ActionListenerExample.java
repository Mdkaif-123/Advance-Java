
package ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActionListenerExample extends JFrame implements ActionListener {
  Label l1;

  ActionListenerExample() {
    setVisible(true);
    setSize(200, 200);
    setLayout(new FlowLayout());

    JButton b1 = new JButton("CLick Me ");
    add(b1);

    l1 = new Label();
    add(l1);
    b1.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent ae) {
    l1.setText("You clicked the button");
  }

  public static void main(String[] args) {
    new ActionListenerExample();
  }
}