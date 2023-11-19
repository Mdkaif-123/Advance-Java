package components;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBardDemo extends JFrame {
  ProgressBardDemo() {
    setVisible(true);
    setLayout(new FlowLayout());
    setSize(400, 200);

    Label l1 = new Label("Downloading");
    add(l1);
    JProgressBar jp = new JProgressBar(0, 100);
    add(jp);
    int i = 0;
    jp.setValue(0);
    jp.setStringPainted(true);
    while (i < 100) {
      i = i + 2;
      jp.setValue(i);
      jp.setString(i + "%");
      try {
        Thread.sleep(100);
      } catch (Exception e) {
        // TODO: handle exception
      }
    }

    jp.setValue(100);
  }

  public static void main(String[] args) {
    new ProgressBardDemo();
  }

}
