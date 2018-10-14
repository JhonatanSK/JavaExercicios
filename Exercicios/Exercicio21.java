/*21) Entrar com o nome, idade e sexo de 20 pessoas. Imprimir o nome sempre que a
pessoa for do sexo masculino e tiver mais de 21 anos.*/
import javax.swing.JOptionPane;


public class Exercicio21 {

    public static void main(String[] args) {

      String nome;
      int idade;
      
      String sexo;
      int cont = 0;
      
      for(int i = 1; i<=20; i++){
          nome = JOptionPane.showInputDialog("Digite seu nome");
          idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
          sexo = JOptionPane.showInputDialog("Digite seu sexo: M para masculino e F para feminino");
          if("M".equals(sexo) && idade >= 21){
              cont ++;
          }
      }
        System.out.println(cont);
      
    }
}