package TCP;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
      ServerSocket serverSocket = new ServerSocket(5555);
      Socket socket = serverSocket.accept();
      System.out.println("Estabelecida a conexão");
      DataInputStream dis = new DataInputStream(socket.getInputStream());
      
      while(true){
        String s = dis.readUTF();
        System.out.println("cliente diz: "+s);
        if(s.equalsIgnoreCase("sair")){
          break;
        }
      }
      socket.close();
      serverSocket.close();
    }
  }