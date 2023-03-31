package TCP;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class Server {
    public static void main(String[] args) throws Exception{
      ServerSocket serverSocket = new ServerSocket(5555);
      Socket socket = serverSocket.accept();
      System.out.println("Estabelecida a conexão");
      DataInputStream dis = new DataInputStream(socket.getInputStream());
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      while(true){
        String s = dis.readUTF();
        System.out.println("client: "+s);
        if(s.equalsIgnoreCase("sair")){
          break;
        }
      }
      socket.close();
    }
  }