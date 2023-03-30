package TCP;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

import javax.swing.JOptionPane;

public class Client {
    public static void main(String[] args) {
      try {
        Socket cliente = new Socket("Obi-Wan Kenobi",6868);
        ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
        Date data_atual = (Date)entrada.readObject();
        JOptionPane.showMessageDialog(null,"Data recebida do servidor:" + data_atual.toString());
        entrada.close();
        System.out.println("Conexão encerrada");
        cliente.close();
      }
      catch(Exception e) {
        System.out.println("Erro: " + e.getMessage());
      }
    }
  }