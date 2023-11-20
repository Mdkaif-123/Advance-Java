
import java.io.*;
import java.net.*;

public class URLConnectionExample {
  public static void main(String[] args) {
    try {
      URL u = new URL("https://www.javatpoint.com/java-fileoutputstream-class");
      URLConnection urlCon = u.openConnection();
      InputStream stream = urlCon.getInputStream();
      FileOutputStream fout = new FileOutputStream("D:\\test2.html");
      int i;

      while ((i = stream.read()) != -1) {
        fout.write((char) i);
        System.out.print((char) i);
      }

      fout.close();
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
