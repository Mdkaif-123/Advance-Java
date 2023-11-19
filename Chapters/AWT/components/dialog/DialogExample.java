package AWT.components.dialog;

import java.awt.*;

class DialogExample extends Frame {
  DialogExample(String title) {
    super(title);
    setSize(200, 200);
    setVisible(true);
    setLayout(new FlowLayout(FlowLayout.CENTER));

    Button b1 = new Button("Submit");
    add(b1);
  }

  public static void main(String[] args) {
    DialogExample dialog = new DialogExample("Dialog Example");
    dialog.setBackground(Color.red);
  }
}
