import javax.swing.JOptionPane;

 public class Idade
 {
  
  public static void main(String[] args)
  {
   int Idade = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade"));
   
   int Ano = 365;
   
   JOptionPane.showMessageDialog(null,"Sua idade em dias é: " + Idade*365);
  }
 
 }