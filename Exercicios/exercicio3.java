// Entrar com v�rios n�meros positivos e imprimir a m�dia dos n�meros digitados. 
import javax.swing.*;

public class exercicio3{
   public static void main (String args []){
      int cont = 0;
      double soma = 0;
      double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero"));
      
      while (n1 > 0){
         soma += n1;
         cont++;
         n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero"));

      }
      if(cont > 0){
         JOptionPane.showMessageDialog(null, soma/cont);
      }
   }
}