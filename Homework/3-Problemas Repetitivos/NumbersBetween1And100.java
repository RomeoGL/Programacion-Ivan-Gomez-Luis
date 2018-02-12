/*
Incompleto
*/
import javax.swing.JOptionPane;
public class NumbersBetween1And100
{
  public static void main (String[]argrs)
  {
    int n; //Numero par por generar
    for (n=0;n<=100;n+=2)
    {
    JOptionPane.showMessageDialog(null, "The numbers between 0 and 100 are: " + n);
    }
  }
}
