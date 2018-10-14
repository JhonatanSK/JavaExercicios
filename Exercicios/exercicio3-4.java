//Entrar com vários números positivos e imprimir a média dos números digitados. 

import javax.swing.JOptionPane;

public class exercicio3{
   public static void main (String args[]){
      int cont = 0;
      double soma =0;
      String n1 = JOptionPane.showInputDialog("Digite um numero");
      double n2 = Double.parseDouble(n1);
      while (n2 > 0){
         soma += n2;
         ++cont;
         
         n1 = JOptionPane.showInputDialog("Digite outro numero");
         n2 = Double.parseDouble(n1);
                  
      }
   if (cont > 0){
      JOptionPane.showMessageDialog(null, soma/cont );
      }
   }
}