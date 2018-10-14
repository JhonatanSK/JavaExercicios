import javax.swing.JOptionPane;

public class exercicio4
{
public static void main (String[] args)
{
String primeiro = JOptionPane.showInputDialog("primeira palavra");
String segunda = JOptionPane.showInputDialog("segunda palavra");
String terceira = JOptionPane.showInputDialog("terceira palavra");

int total = primeiro.length() + segunda.length() + terceira.length();
JOptionPane.showMessageDialog(null,total);
}
}