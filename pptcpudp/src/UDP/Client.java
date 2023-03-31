package UDP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 5555);
    //DataOutputStream dis = new DataOutputStream(socket.getOutputStream());
    InputStreamReader entrada = new InputStreamReader(socket.getInputStream());
    BufferedReader reader = new BufferedReader(entrada);
    PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
    printWriter.println("FUNCIONA");
    printWriter.flush();
    
    String s = reader.readLine();
    System.out.println("Servidor: " + s);
  }
}