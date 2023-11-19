package AWT.components.scrollbar;

import java.awt.*;

public class ExampleScroll extends Frame {

 ExampleScroll() {
  setSize(300, 300);
  setVisible(true);
  setLayout(new FlowLayout(FlowLayout.CENTER));
  ScrollPane pane = new ScrollPane();
  Scrollbar sc = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 100);

  pane.add(sc);
  add(pane);
 }

 public static void main(String[] args) {
  new ExampleScroll();
 }
}
