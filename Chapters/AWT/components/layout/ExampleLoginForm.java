package AWT.components.layout;

import java.awt.*;

public class ExampleLoginForm extends Frame {

 ExampleLoginForm() {
  setSize(300, 200);
  setVisible(true);
  setLayout(new GridLayout(3, 2));

  Label l1, l2;
  TextField t1, t2;
  Button b1, b2;

  l1 = new Label("Enter Username");
  t1 = new TextField(8);

  add(l1);
  add(t1);

  l2 = new Label("Enter Password");
  t2 = new TextField(8);
  t2.setEchoChar('*');

  add(l2);
  add(t2);

  b1 = new Button("Cancel");
  b2 = new Button("Submit");

  add(b1);
  add(b2);
 }

 public static void main(String[] args) {
  new ExampleLoginForm();
 }
}
