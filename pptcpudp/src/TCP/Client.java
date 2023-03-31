package TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class Client {
    public static void main(String[] args) throws Exception{
      Socket socket = new Socket("localhost", 5555);
      DataOutputStream dis = new DataOutputStream(socket.getOutputStream());
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      while(true){
        String s = reader.readLine();
        dis.writeUTF(s);
        if(s.equalsIgnoreCase("encerrar conexão")){
          break;
        }
      }
      socket.close();
    }
  }