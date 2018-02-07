/*
FactorialForLoop.java
Ivan Gomez Luis
This program prints the factorial of a number
*/
import javax.swing.JOptionPane;
public class FactorialForLoop
{
  public static void main(String[] args)
 {
   int factorial=1, number;
   number=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number" , "number", JOptionPane.WARNING_MESSAGE));
   for (int i=1;i<=number;i++ )
   {
     factorial*= i;
   }
   JOptionPane.showMessageDialog(null, "The factorial of "+ number +" is " + factorial, "Factorial", JOptionPane.OK_OPTION);
 }
}
