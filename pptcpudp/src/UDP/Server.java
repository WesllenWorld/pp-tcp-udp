package UDP;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(5555);
    Socket socket = serverSocket.accept();
    System.out.println("Estabelecida a conexão");
    InputStreamReader entrada = new InputStreamReader(socket.getInputStream());
    BufferedReader reader = new BufferedReader(entrada);

    String s = reader.readLine();
    System.out.println("cliente diz: " + s);
    PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
    printWriter.println("Sim, tô recebendo ");
    printWriter.flush();

  }
}