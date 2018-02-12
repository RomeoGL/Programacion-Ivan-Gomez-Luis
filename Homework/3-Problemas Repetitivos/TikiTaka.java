/*
Ivan Gomez Luis
TikiTaka.java
Exercise 3.7
This program calculates how many tepes of sales there were in one day and shows the result in the screen
*/
import javax.swing.JOptionPane;
public class TikiTaka
{
  public static void main(String[]args)
  {
    float n;//Numero de ventas
    float cn=1;//Contador de las ventas
    int a=0;//Ventas mayores a mil
    int b=0;//Ventas mayores a quinientos pero menores o iguales a mil
    int c=0;//Ventas menores o iguales a quinientos
    float v; //Monto de la venta
    float t1=0;//Total de las ventas tipo A
    float t2=0;//Toral de la ventas tipo B
    float t3=0;//Total de la ventas tipo c
    float tt; //Total de las ventas
    n=Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of customers you had today"));
    do
    {
      v=Float.parseFloat(JOptionPane.showInputDialog("How much you paid in the sale number " + cn));
      if (v>=1000)
      {
        a++;
        t1=t1+v;
      }
      else if (v>=500 && v<1000)
      {
        b++;
        t2=t2+v;
      }
      else if (v<=500)
      {
        c++;
        t3=t3+v;
      }
    cn=cn+1;
  }while (cn<n+1);
  JOptionPane.showMessageDialog(null, "Today, you had " + a + " type A purchases and the total collected for them was $" + t1 +"\nToday, you had " + b + " type B purchases and the total collected for them was $" + t2 + "\nToday, you had " + c + " type C purchases and the total collected for them was $" + t3);
  }
}
