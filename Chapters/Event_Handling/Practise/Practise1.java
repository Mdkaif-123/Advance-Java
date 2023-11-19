
package Practise;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.*;

class Practise1 implements ActionListener {
  JLabel l1 = new JLabel();
  JFrame jf = new JFrame();

  Practise1() {

    jf.setVisible(true);
    jf.setSize(200, 200);
    jf.setLayout(new BorderLayout());

    MenuBar menuBar = new MenuBar();
    jf.setMenuBar(menuBar);
    Menu menu1 = new Menu("Color");
    menuBar.add(menu1);
    Menu menu2 = new Menu("Edit");
    menuBar.add(menu2);

    MenuItem m1 = new MenuItem("Red");
    MenuItem m2 = new MenuItem("Yellow");
    MenuItem m3 = new MenuItem("Green");
    MenuItem m4 = new MenuItem("Cyan");
    MenuItem m5 = new MenuItem("Black");
    MenuItem m6 = new MenuItem("Close");
    menu1.add(m1);
    menu1.add(m2);
    menu1.add(m3);
    menu1.add(m4);
    menu1.add(m5);
    menu1.addSeparator();
    menu1.add(m6);

    m1.addActionListener(this);
    m2.addActionListener(this);
    m3.addActionListener(this);
    m4.addActionListener(this);
    m5.addActionListener(this);

    jf.add(l1, BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent ae) {
    System.out.println("" + ae.getActionCommand());
    if (ae.getActionCommand() == "Yellow") {
      jf.getContentPane().setBackground(Color.YELLOW);
      l1.setText("yellow");
    } else if (ae.getActionCommand() == "Red") {
      jf.getContentPane().setBackground(Color.RED);
      l1.setText("Red");
    } else if (ae.getActionCommand() == "Green") {
      jf.getContentPane().setBackground(Color.GREEN);
      l1.setText("Green");
    } else if (ae.getActionCommand() == "Cyan") {
      jf.getContentPane().setBackground(Color.CYAN);
      l1.setText("Cyan");
    } else if (ae.getActionCommand() == "Black") {
      jf.getContentPane().setBackground(Color.BLACK);
      l1.setText("Black");
      l1.setForeground(Color.WHITE);
    }
  }

  public static void main(String[] args) {
    new Practise1();
  }

}