//4) Ler v�rios n�meros e informar quantos n�meros entre 100 e 200 foram digitados. 
//Quando o valor 0 (zero) for lido o algoritmo dever� cessar sua execu��o. 

import javax.swing.*;

public class exercicio4{
   public static void main (String args []){
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      int cont = 0;
      
      while(n1 != 0){
         n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            
         if(n1 >= 100 && n1 <=200){
         cont++;
         }            
      }

         JOptionPane.showMessageDialog(null, cont);
      
   }
}