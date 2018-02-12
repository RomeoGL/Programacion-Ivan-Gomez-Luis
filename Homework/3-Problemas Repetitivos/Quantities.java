/*
Ivan Gomez Luis
Quantities.java
This program performs the num of 10 amounts using the "while" cycle
Exercise 3.1
*/
import javax.swing.JOptionPane;
public class Quantities
{
  public static void main(String[] args)
  {
    int c=1; //Contador
    double va=0; //Valor por sumar
    double su=0; //Suma de los valores
    va=Double.parseDouble(JOptionPane.showInputDialog("Enter the number to add"));
    while (c>=10)
    {
      c++;
      su+=va;
    }
    JOptionPane.showMessageDialog(null, "The sum total is: " + su);
  }
}
