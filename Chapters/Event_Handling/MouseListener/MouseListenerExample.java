
package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends JFrame implements MouseListener {

  Label l1;

  MouseListenerExample() {
    setVisible(true);
    setSize(200, 200);
    setLayout(new FlowLayout());

    l1 = new Label();
    add(l1);

    this.addMouseListener(this);
  }

  public void mouseClicked(MouseEvent me) {
    l1.setText("Mouse Clicked");
  };

  public void mouseExited(MouseEvent me) {
    l1.setText("Mouse Exited");
  };

  public void mousePressed(MouseEvent me) {
    l1.setText("Mouse Pressed");
  };

  public void mouseEntered(MouseEvent me) {
    l1.setText("Mouse Entered");
  };

  public void mouseReleased(MouseEvent me) {
    l1.setText("Mouse Released");
  };

  public static void main(String[] args) {
    new MouseListenerExample();
  }
}