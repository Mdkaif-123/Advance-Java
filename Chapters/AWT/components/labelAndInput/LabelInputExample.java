package AWT.components.labelAndInput;

import java.awt.*;

public class LabelInputExample extends Frame {
  LabelInputExample() {
    setSize(350, 500);
    setVisible(true);
    setLayout(new FlowLayout(FlowLayout.CENTER));
    Label l1 = new Label("Enter email");
    TextField t1 = new TextField(20);
    add(l1);
    add(t1);

    Label l2 = new Label("Enter feedback");
    TextArea textArea = new TextArea("default Text", 12, 25);
    add(l2);
    add(textArea);
  }

  public static void main(String[] args) {
    new LabelInputExample();
  }
}
