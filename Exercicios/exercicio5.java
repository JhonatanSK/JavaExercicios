//Entrar com nomes enquanto forem diferentes de FIM e imprimir cada nome digitado.

import javax.swing.*;

public class exercicio5{
   public static void main (String args []){
      String nome = JOptionPane.showInputDialog("Digite um nome");
      //String fim = "FIM";
      
      while (!"FIM".equals(nome)){
         nome = JOptionPane.showInputDialog("Digite um nome");
         JOptionPane.showMessageDialog(null, nome);
         
         if ("FIM".equals(nome)){
            System.exit(0);
         }
      }
   }
}

//FUNCIONANDO