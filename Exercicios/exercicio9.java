/*Imprimir na tela todos os números de 1 a 100 e a soma deles. */

public class exercicio9{
   public static void main (String [] args){
      int resultado = 0;
      int ultimoValor;
      for (int i = 1; i<=100; i++){
         ultimoValor = resultado;
         resultado += i;
         System.out.println(resultado, ultimoValor, i);

      }
      
   }
}

// NÃO CONSEGUI