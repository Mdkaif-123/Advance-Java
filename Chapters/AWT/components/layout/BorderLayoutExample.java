package AWT.components.layout;

import java.awt.*;

class BorderLayoutExample extends Frame {

 BorderLayoutExample() {
  setSize(300, 300);
  setVisible(true);
  setLayout(new BorderLayout());

  Button b1 = new Button("North");
  Button b2 = new Button("South");
  Button b3 = new Button("East");
  Button b4 = new Button("West");
  Button b5 = new Button("Center");

  add(b1, BorderLayout.NORTH);
  add(b2, BorderLayout.SOUTH);
  add(b3, BorderLayout.EAST);
  add(b4, BorderLayout.WEST);
  add(b5, BorderLayout.CENTER);
 }

 public static void main(String[] args) {
  new BorderLayoutExample();
 }
}
