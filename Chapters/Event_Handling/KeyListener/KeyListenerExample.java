package KeyListener;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class KeyListenerExample extends JFrame implements KeyListener {
  JLabel l1;

  KeyListenerExample() {
    setVisible(true);
    setSize(200, 200);
    setLayout(new FlowLayout());

    l1 = new JLabel();
    add(l1);

    addKeyListener(this);
  }

  public void keyPressed(KeyEvent ke) {
    Character ch = ke.getKeyChar();
    l1.setText("Key you typed :" + ch);
  }

  public void keyReleased(KeyEvent ke) {
  }

  public void keyTyped(KeyEvent ke) {
  }

  public static void main(String[] args) {
    new KeyListenerExample();
  }
}
