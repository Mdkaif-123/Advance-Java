package components;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeDemo extends JFrame {

  TreeDemo() {
    setVisible(true);
    setLayout(new BorderLayout(50, 50));
    setSize(400, 200);

    DefaultMutableTreeNode Style = new DefaultMutableTreeNode("Style");

    DefaultMutableTreeNode Color = new DefaultMutableTreeNode("Color");
    DefaultMutableTreeNode Font = new DefaultMutableTreeNode("Font");

    DefaultMutableTreeNode Red = new DefaultMutableTreeNode("Red");
    DefaultMutableTreeNode Yellow = new DefaultMutableTreeNode("Yellow");
    DefaultMutableTreeNode Green = new DefaultMutableTreeNode("Green");
    DefaultMutableTreeNode Black = new DefaultMutableTreeNode("Black");

    Color.add(Red);
    Color.add(Black);
    Color.add(Yellow);
    Color.add(Green);

    Style.add(Color);
    Style.add(Font);

    JTree tree = new JTree(Style);

    int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

    JScrollPane sp = new JScrollPane(tree, v, h);
    add(sp, BorderLayout.WEST);
  }

  public static void main(String[] args) {
    new TreeDemo();
  }
}
