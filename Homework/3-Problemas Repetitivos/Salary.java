/*
Ivan Gomez Luis
Salary.java
This program calculates the salary of many workers
Exercise 3.9
*/
import javax.swing.JOptionPane;
public class Salary
{
  public static void main(String[]args)
  {
    double ht; //Horas trabajadas
    int i; //Contador del ciclo de empleado
    int n; //Numero de trabajadores
    double pg=0; //Pago Global
    double ph; //Pago por hora
    double ss; //Sueldo semanal
    n=Integer.parseInt(JOptionPane.showInputDialog("Enter how many workers you have "));
    i = 1;
    while (i<n+1)
    {
      ph=Double.parseDouble(JOptionPane.showInputDialog("Enter worker's salary "+i));
      ht=Double.parseDouble(JOptionPane.showInputDialog("Enter the hours worked"));
      ss = ht*ph;
      pg = pg+ss;
      JOptionPane.showMessageDialog(null, "You'll pay the clerk "+i+" $ "+ss);
    i = i+1;
    }
    JOptionPane.showMessageDialog(null, "Total paid to the "+i+" employees is $"+pg);
  }
}
