import javax.swing.JOptionPane;
 
 public class Retangulo
 {
  
  public static void main(String[] args)
  {
   
    double Base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do retangulo"));
    double Altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do retangulo"));
    
    JOptionPane.showMessageDialog(null,Base*Altura);
    
   
  }
 
 }