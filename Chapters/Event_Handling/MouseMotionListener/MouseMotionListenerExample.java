package MouseMotionListener;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class MouseMotionListenerExample extends JFrame implements MouseMotionListener {

  JLabel label = new JLabel();

  MouseMotionListenerExample() {
    setVisible(true);
    setSize(200, 200);
    setLayout(new FlowLayout());

    add(label);
    this.addMouseMotionListener(this);
  }

  public void mouseDragged(MouseEvent me) {
    label.setText("Mouse Dragged");
  };

  public void mouseMoved(MouseEvent me) {
    label.setText("Mouse Moved");
  };

  public static void main(String[] args) {
    new MouseMotionListenerExample();
  }
}
