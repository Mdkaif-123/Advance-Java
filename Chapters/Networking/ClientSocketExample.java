
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class ClientSocketExample {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 8000);
    DataOutputStream din = new DataOutputStream(socket.getOutputStream());

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the message to send : ");
    String message = sc.nextLine();
    din.writeUTF(message);
    din.flush();

    socket.close();
  }
}
