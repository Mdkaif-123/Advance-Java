import java.net.*;
import java.io.*;

/**
 * URLParser
 */
public class URLParser {

  public static void main(String[] args) {

    URL url;
    try {
      url = new URL("http://www.javatpoint.com/java-tutorial");
      System.out.println(url.getHost());
      System.out.println(url.getProtocol());
      System.out.println(url.getPort());
      System.out.println(url.getFile());
    } catch (MalformedURLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}