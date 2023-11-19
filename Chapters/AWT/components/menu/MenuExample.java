package AWT.components.menu;

import java.awt.*;

class MenuExample extends Frame {
  MenuExample() {
    setTitle("Menu Example");
    setSize(300, 400);
    setVisible(true);

    MenuBar menuBar = new MenuBar();
    setMenuBar(menuBar);

    Menu m1 = new Menu("Colors");
    Menu m2 = new Menu("Edit");
    menuBar.add(m1);
    menuBar.add(m2);

    MenuItem menuItem = new MenuItem("Green");
    m1.add(menuItem);
    m1.add(new MenuItem("Red"));
    m1.addSeparator();
    m1.add(new MenuItem("Blue"));

  }

  public static void main(String[] args) {

    new MenuExample();
  }
}
