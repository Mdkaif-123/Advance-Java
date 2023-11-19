package components;

import javax.swing.*;
import java.awt.*;

class ScrollPaneDemo extends JFrame {
  ScrollPaneDemo() {
    setVisible(true);
    setLayout(new BorderLayout());
    setSize(400, 200);

    JPanel jp = new JPanel();
    jp.setLayout(new GridLayout(5, 5));

    int b = 0;
    for (int i = 0; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        jp.add(new Button("Button" + b));
        ++b;
      }
    }

    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
    int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

    JScrollPane sp = new JScrollPane(jp, v, h);
    add(sp, BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    new ScrollPaneDemo();
  }

}
