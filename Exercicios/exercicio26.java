/*  Escrever um algoritmo que lê 2 números reais. A seguir, é apresentado, para o usuário, o menu a seguir: 
“Operações Disponíveis: 1. Adição 2. Subtração 3. Multiplicação 4. Divisão 9. Sair do Programa Digite o número de ordem da 
opção desejada: “ Se a opção for 1, o algoritmo deve somar os dois valores lidos; se for 2, o algoritmo deve fazer o primeiro valor 
menos o segundo; se for 3, o algoritmo deve multiplicar os valores lidos; se for 4, o algoritmo deve dividir o primeiro pelo segundo valor
 lido, desde que este não seja zero (o algoritmo deve ter tratamento especial para este caso). O algoritmo deve escrever o resultado da 
 operação escolhida. Se o usuário digitar 9, o algoritmo deve ser encerrado. Enquanto o valor da opção 9 não for digitado, o menu
  deve ser apresentado novamente.  */
import javax.swing.*;
   
public class exercicio26{
   public static void main (String [] args){
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
      int n3 = Integer.parseInt(JOptionPane.showInputDialog("“Operações Disponiveis: \n 1. Adicão \n 2. Subtração \n 3. Multiplicação \n 4. Divisão \n 9. Sair do Programa "));
      
      switch(n3){
         case 1: n3 = (n1 + n2);
            break;
         case 2: n3 = (n1 - n2);
            break;
         case 3: n3 = (n1 * n2);
            break;
         case 4: n3 = (n1 / n2);
            break;
         case 9: System.exit(9);
      }
      JOptionPane.showMessageDialog(null, n3 );
   }
}

// RESOLVIDO!!!