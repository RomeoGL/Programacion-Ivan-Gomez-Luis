/*
Ivan Gomez Luis
SaleOfPencils.java
This program calculates when you should pay for a purchase of pencils
Exercise 2.3
*/
import javax.swing.JOptionPane;
public class SaleOfPencils
{
  public static void main(String[] args)
  {
    int x; //Cantidad de lapices
    double pag; //Pago que se realizar por los lapices
    x=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of pencils purchased"));
    if (x>1000)
    {
      pag=(x*0.85);
      JOptionPane.showMessageDialog(null, "The total to pay for the " + x + " pencils is $" + pag );
    }
    else if (x<=1000)
    {
      pag=(x*0.90);
      JOptionPane.showMessageDialog(null, "The total to pay for the " + x + " pencils is $" + pag );
    }
  }
}
