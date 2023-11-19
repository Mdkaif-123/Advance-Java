package AWT.components.choices;

import java.awt.*;

public class ChoiceExample extends Frame {
 ChoiceExample() {
  setSize(200, 200);
  setVisible(true);
  setLayout(new FlowLayout(FlowLayout.CENTER));

  Label l1 = new Label("You language");
  add(l1);
  Choice c = new Choice();
  c.add("c");
  c.add("c++");
  c.add("java");

  add(c);
 }

 public static void main(String[] args) {
  new ChoiceExample();
 }
}
