/*17) Fa�a um algoritmo para imprimir na tela uma tabela de convers�o de polegadas
para cent�metros. Deseja-se que a tabela conste de valores desde 1 at� 20
polegadas. Lembre-se que 1 polegada equivale a 2,54 cm.*/

import javax.swing.*;

public class Exercicio17{
   public static void main (String [] args){
      //double polegada = 2.54;
      double i;
      
      for ( i = 1; i <=20; i ++ ){
          
          JOptionPane.showMessageDialog(null,i + " polegada � igual a " + i*2.54 + " centimetros");
      }
         

   }
}

// RESOLVIDO!!!
