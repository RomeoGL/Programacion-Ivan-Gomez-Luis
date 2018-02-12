/*
Ivan Gomez Luis
Saving.java
This program calculates how much it will save in 12 months
exercise 3.3
*/
import javax.swing.JOptionPane;
public class Saving
{
  public static void main(String[] args)
 {
   float ah; //Ahorro mensual
   //int m=12; //Contador del mes
   int ca=0; //Cantidad que se va a ahorrar
   for (int m=1;m<=12;m+=1)
   {
     ah=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter amount to save this month"));
     ca+=ah;
   }
   JOptionPane.showMessageDialog(null, "The total saved is: " + ca);
 }
}
