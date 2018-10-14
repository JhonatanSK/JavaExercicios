// Entrar com vários números positivos e imprimir a média dos números digitados. 
import javax.swing.*;

public class exercicio3{
   public static void main (String args []){
      int cont = 0;
      double soma = 0;
      double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
      
      while (n1 > 0){
         soma += n1;
         cont++;
         n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

      }
      if(cont > 0){
         JOptionPane.showMessageDialog(null, soma/cont);
      }
   }
}