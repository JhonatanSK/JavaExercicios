/*
Entrar com a idade de várias pessoas e imprimir: total de pessoas com menos
de 21 anos e total de pessoas com mais de 50 anos. Parar quando
for digitada uma idade fora da faixa 0-120 anos.
 */
package exercicios;

import javax.swing.JOptionPane;


 
public class Exercicio12 {
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
//RESOLVIDO!!!