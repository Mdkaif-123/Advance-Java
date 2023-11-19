import java.awt.*;

class ExampleButton extends Frame {
   ExampleButton() {
      Button b1 = new Button("Btn1");
      Button b2 = new Button("Btn2");
      Button b3 = new Button("Btn3");
      Button b4 = new Button("Btn4");
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      setVisible(true);
      setSize(200, 200);
      setLayout(new FlowLayout());
   }

   public static void main(String a[]) {
      new ExampleButton();
   }
}