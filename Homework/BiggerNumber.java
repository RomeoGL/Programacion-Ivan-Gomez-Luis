/*
Ivan Gomez Luis
BiggerNumber.java
This program calculates which is the highest number
*/
import javax.swing.JOptionPane;
public class BiggerNumber
{
  public static void main(String[] args)
  {
    float A; //Primer Valor
    float B; //Segundo Valor
    float C; //Tercer valor
    float M; //Valor mayor
    A=Float.parseFloat(JOptionPane.showInputDialog("Enter the frist number"));
    B=Float.parseFloat(JOptionPane.showInputDialog("Enter the second number"));
    C=Float.parseFloat(JOptionPane.showInputDialog("Enter the third number"));
    if (A>B && A>C)
    {
      M=A;
      JOptionPane.showMessageDialog(null, "The bigger number is " + M);
    }
    else if (B>C && B>A)
    {
      M=B;
      JOptionPane.showMessageDialog(null, "The bigger number is " + M);
    }
    else if (C>A && C>B)
    {
      M=C;
      JOptionPane.showMessageDialog(null, "The bigger number is " + M);
    }
  }
}
