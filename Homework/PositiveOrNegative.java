/**
Ivan Gomez Luis
PositiveOrNegative.java
This number finds out if the number entered is negative or positive
exercise 2.2
*/
import javax.swing.JOptionPane;
public class PositiveOrNegative
{
  public static void main(String[] args)
  {
    int NUM; //Valor para determinar su signo
    String R; //Resultado del signo del valor
    NUM = Integer.parseInt(JOptionPane.showInputDialog("Enter the frist number"));
    if (NUM>0)
    {
      JOptionPane.showMessageDialog(null, "The number is positive");
    }
    else if (NUM< -1)
    {
      JOptionPane.showMessageDialog(null, "The number is negative");
    }
    else
      JOptionPane.showMessageDialog(null, "The number is 0");
  }
}
