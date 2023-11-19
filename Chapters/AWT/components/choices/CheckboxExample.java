package AWT.components.choices;

import java.awt.*;

public class CheckboxExample extends Frame {

 CheckboxExample() {
  setSize(200, 200);
  setVisible(true);
  setLayout(new FlowLayout(FlowLayout.CENTER));

  CheckboxGroup cbg = new CheckboxGroup();
  Checkbox c1 = new Checkbox("jai", false, cbg);
  Checkbox c2 = new Checkbox("jai", false, cbg);
  Checkbox c3 = new Checkbox("jai", false, cbg);
  Checkbox c4 = new Checkbox("jai", false, cbg);
  add(c1);
  add(c2);
  add(c3);
  add(c4);
 }

 public static void main(String[] args) {
  new CheckboxExample();

 }
}
