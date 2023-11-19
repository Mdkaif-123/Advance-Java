package AWT.components.layout;

import java.awt.*;

public class GridLayoutExample extends Frame {

 GridLayoutExample() {
  setSize(300, 300);
  setVisible(true);
  setLayout(new GridLayout(1, 3));

  Button b1 = new Button("North");
  Button b2 = new Button("South");
  Button b3 = new Button("East");
  Button b4 = new Button("West");
  Button b5 = new Button("Center");

  add(b1);
  add(b2);
  add(b3);
  add(b4);
  add(b5);
 }

 public static void main(String[] args) {
  new GridLayoutExample();
 }
}
