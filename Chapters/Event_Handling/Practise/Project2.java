package Practise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project2 extends JFrame implements TextListener, ActionListener {
  JPanel cardPanel, Login, PlayGround;
  CardLayout card;
  JLabel l1, l2, error;
  TextField t1, t2;
  JButton b1, b2, m1, m2, m3, m4, m5;

  Project2() {
    cardPanel = new JPanel();
    setSize(500, 500);
    setVisible(true);
    card = new CardLayout(10, 10);
    cardPanel.setLayout(card);

    // Login Page
    Login = new JPanel();
    Login.setLayout(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 0;

    l1 = new JLabel("Enter Username");
    t1 = new TextField(8);
    Login.add(l1, gbc);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 0;
    Login.add(t1, gbc);

    l2 = new JLabel("Enter Password");
    t2 = new TextField(8);
    t2.setEchoChar('*');
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.ipadx = 20;
    gbc.gridy = 1;
    Login.add(l2, gbc);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 1;
    Login.add(t2, gbc);

    b1 = new JButton("Cancel");
    b2 = new JButton("Submit");

    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 2;
    Login.add(b1, gbc);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 2;
    Login.add(b2, gbc);

    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 4;
    error = new JLabel();
    Login.add(error, gbc);

    t1.addTextListener(this);
    t2.addTextListener(this);

    b1.addActionListener(this);
    b2.addActionListener(this);

    // Playground Page
    PlayGround = new JPanel();
    PlayGround.setLayout(new BorderLayout());

    Container NorthButton = new Container();
    NorthButton.setLayout(new FlowLayout(FlowLayout.CENTER));
    m1 = new JButton("Red");
    m2 = new JButton("Yellow");
    m3 = new JButton("Green");
    m4 = new JButton("Cyan");
    m5 = new JButton("Black");
    NorthButton.add(m1);
    NorthButton.add(m2);
    NorthButton.add(m3);
    NorthButton.add(m4);
    NorthButton.add(m5);
    PlayGround.add(NorthButton);

    m1.addActionListener(this);
    m2.addActionListener(this);
    m3.addActionListener(this);
    m4.addActionListener(this);
    m5.addActionListener(this);

    cardPanel.add(Login);
    cardPanel.add(PlayGround);

    add(cardPanel);
  }

  public void textValueChanged(TextEvent te) {
    if (te.getSource() == t1) {
      if (!(t1.getText().contains("@"))) {
        error.setText("Enter a valid username");
      } else {
        error.setText("");
      }
    } else if (te.getSource() == t2) {
      if (t2.getText().length() < 8) {
        error.setText("More than 8 character");
      } else {
        error.setText("");
      }
    }
  }

  public void actionPerformed(ActionEvent ae) {

    if (ae.getSource() == m1 || ae.getSource() == m2 || ae.getSource() == m3 || ae.getSource() == m4
        || ae.getSource() == m5) {
      String color = ae.getActionCommand().toString();
      System.out.println(color);
      if (color == "Red")
        PlayGround.setBackground(Color.RED);
      else if (color == "Yellow")
        PlayGround.setBackground(Color.YELLOW);
      else if (color == "Green")
        PlayGround.setBackground(Color.GREEN);
      else if (color == "Cyan")
        PlayGround.setBackground(Color.CYAN);
      else if (color == "Black")
        PlayGround.setBackground(Color.BLACK);
    }

    if ("Cancel".equals(ae.getActionCommand())) {
      System.exit(0);
    } else if ("Submit".equals(ae.getActionCommand())) {
      System.out.println("Working");
      String username = t1.getText().trim(); // trim to remove leading/trailing whitespaces
      String password = t2.getText().trim();

      if ("admin@gmail.com".equals(username)) {
        if ("12345678".equals(password)) {
          card.next(cardPanel);
          System.out.println("Working");
        } else {
          error.setText("Incorrect Password");
        }
      } else {
        error.setText("Incorrect Username");
      }
    }
  }

  public static void main(String[] args) {
    new Project2();
  }
}
