package AWT.components.layout;

import java.awt.*;

public class FlowLayoutExample extends Frame {

 FlowLayoutExample() {
  setSize(300, 300);
  setVisible(true);
  setLayout(new FlowLayout(FlowLayout.LEFT));

  Label l1 = new Label("Label 1");
  Label l2 = new Label("Label 2");
  Label l3 = new Label("Label 3");
  Label l4 = new Label("Label 4");

  add(l1);
  add(l2);
  add(l3);
  add(l4);
 }

 public static void main(String[] args) {
  new FlowLayoutExample();
 }
}
