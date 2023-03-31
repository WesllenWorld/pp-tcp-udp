package TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

import javax.swing.JOptionPane;

public class Client {
    public static void main(String[] args) throws Exception{
      Socket socket = new Socket("localhost", 5555);
      DataOutputStream dis = new DataOutputStream(socket.getOutputStream());
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      while(true){
        String s = reader.readLine();
        dis.writeUTF(s);
        if(s.equalsIgnoreCase("sair")){
          break;
        }
      }
      socket.close();
    }
  }