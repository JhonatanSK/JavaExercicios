import javax.swing.JOptionPane;
 
 public class exercicio3
 {
 public static void main(String[] args)
 {
 int inteiro = Integer.parseInt(JOptionPane.showInputDialog("coloque um numero inteiro"));
 double numero = Math.pow(inteiro, 2);
 
 JOptionPane.showMessageDialog(null, numero);
 }
 }