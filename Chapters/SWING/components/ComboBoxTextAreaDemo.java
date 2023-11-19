package components;

import javax.swing.*;
import java.awt.*;

class ComboBoxTextAreaDemo extends JFrame {

  ComboBoxTextAreaDemo() {
    setVisible(true);
    setLayout(new FlowLayout(FlowLayout.CENTER));
    setSize(400, 200);

    String country[] = { "India", "Pakistan", "USA", "AU" };

    Label l1 = new Label("Select your country");
    add(l1);
    JComboBox cb = new JComboBox<>(country);
    add(cb);

    Label l2 = new Label("Enter your feedback");
    add(l2);
    JTextArea t1 = new JTextArea(10, 20);
    add(t1);

    Button b1 = new Button("Submit");
    add(b1);
  }

  public static void main(String[] args) {
    new ComboBoxTextAreaDemo();

  }
}
