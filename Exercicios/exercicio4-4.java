/* Ler v�rios n�meros e informar quantos n�meros entre 100 e 200 foram digitados.
Quando o valor 0 (zero) for lido o algoritmo dever� cessar sua execu��o. */

import javax.swing.JOptionPane;

public class exercicio4{
   public static void main (String args[]){
      int num =Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
      int contador =0;
      
      while (num !=0){
         num =Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
      
         if (num >=100 && num <=200){
         contador++;
         }

      }
      JOptionPane.showMessageDialog(null, contador);
   }
}