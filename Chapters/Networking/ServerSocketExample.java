import java.net.*;
import java.io.*;

public class ServerSocketExample {
  public static void main(String[] args) {
    try {
      ServerSocket ss = new ServerSocket(8000);
      System.out.println("Waiting for the message");
      Socket socket = ss.accept();

      DataInputStream din = new DataInputStream(socket.getInputStream());
      String message = (String) din.readUTF();

      System.out.println(message);

      ss.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
