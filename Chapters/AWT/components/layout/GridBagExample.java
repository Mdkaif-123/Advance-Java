package AWT.components.layout;

import java.awt.*;

class GridBagExample extends Frame {
 GridBagExample() {
  setSize(300, 300);
  setVisible(true);
  setLayout(new GridBagLayout());

  Button b1 = new Button("Btn1");
  Button b2 = new Button("Btn1");
  Button b3 = new Button("Btn1");

  add(b1);
  add(b2);
  add(b3);
 }

 public static void main(String[] args) {
  new GridBagExample();
 }
}
