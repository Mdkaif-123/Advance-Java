import java.awt.*;

class ExampleCheckbox extends Frame {
   ExampleCheckbox() {
      Checkbox c1 = new Checkbox("Apple");
      Checkbox c2 = new Checkbox("Mango");
      Checkbox c3 = new Checkbox("Banana");
      Checkbox c4 = new Checkbox("Orange");
      add(c1);
      add(c2);
      add(c3);
      add(c4);

      setVisible(true);
      setSize(200, 200);
      setLayout(new FlowLayout());
   }

   public static void main(String a[]) {
      new ExampleCheckbox();
   }
}