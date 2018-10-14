import javax.swing.JOptionPane;

public class bonus{
   public static void main (String args []){
      int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
      int j = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
      
      int resultado = (i > j)? i * j : j - i;
      
      System.out.println(resultado);
   }
}