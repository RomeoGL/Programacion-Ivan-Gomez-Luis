/*
Ivan Gomez Luis
MajorLessEqual.java
This program calculates how many negative amount and how many positives were enteder
Exercice 3.4
*/
import javax.swing.JOptionPane;
public class MajorLessEqual
{
  public static void main (String[]argrs)
  {
    int c=0;//Contador
    int ca=0;//Cantidad por leer
    int cp=0;//Cantidades positivas
    int cn=0; //Cantidades negativas
    float nu; //Numero de cantidades
    nu=Integer.parseInt(JOptionPane.showInputDialog("How many numbers did you enter?"));
    do
    {
      ca=Integer.parseInt(JOptionPane.showInputDialog("Enter a quantity"));
      c=c+1;
      if (ca>=1)
      {
        cp=cp+1;
      }
      else if (ca<=0)
      {
        cn=cn+1;
      }
    }while (c!=nu);
    JOptionPane.showMessageDialog(null, "You entered " + cn + " negative amounts, \n" + cp + " positive amounts." );
  }
}
