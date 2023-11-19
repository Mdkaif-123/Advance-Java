package AWT.components.choices;

import java.awt.*;

public class ListExample extends Frame {
 ListExample() {
  setSize(200, 200);
  setVisible(true);
  setLayout(new FlowLayout(FlowLayout.CENTER));

  List l1 = new List(5);
  l1.add("Java");
  l1.add("Js");
  l1.add("Python");
  add(l1);
 }

 public static void main(String[] args) {
  new ListExample();
 }
}
