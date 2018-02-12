/*
Ivan Gomez Luis
Exercise 3.3
AverageHeight.java
This program gets the average height of a group of people
*/
import javax.swing.JOptionPane;
public class AverageHeight
{
  public static void main (String[]args)
  {
    int c=0; //Contador de personas
    float es=0; //Estatura de cada persona
    float su=0; //Suma de las estaturas
    float pr=0; //Estatura promedio
    char o;
  //  JOptionPane.showMessageDialog(null, "You enter the statues of the people , \n to be able to stop the program do not enter anything");
    do
    {
      c++;
      es=Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the person's stature " + c));
      su+=es;
      o=JOptionPane.showInputDialog("Do you want yo enter another value? Y/N").charAt(0);
    }
    while (o=='y' || o=='Y');
    pr=(su/c);
    JOptionPane.showMessageDialog(null, "The average height is: " + pr);
  }
}
