 //Ler vários números até entrar o número -999. Para cada número, imprimir sua raiz quadrada e seu inverso.

import javax.swing.*;
 
public class exercicio6 {
    public static void main (String [] args){
       int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
       int cont21 = 0;
       int cont50 = 0;
       
       while(idade >=0 && idade <=120){
           idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
           
           if(idade <=21){
           cont21++;
           }
           else if(idade >=50){
           cont50++;
           }
       }
       JOptionPane.showMessageDialog(null, cont21 + " Pessoas com menos de 21");
       JOptionPane.showMessageDialog(null, cont50 + " Pessoas com mais de 50");
       
    }
} 

// NÃO CONSEGUI FAZER! PRECISA CORRIGIR!!!