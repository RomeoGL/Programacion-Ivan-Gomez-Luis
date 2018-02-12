/*
AgeOfStudents.java
Ivan Gomez Luis
This program calculates the age of a gropu of students
Exercise 3.2
*/
import javax.swing.JOptionPane;
public class AgeOfStudents
{
  public static void main(String[] args)
 {
   //int c; Contador
   int ed=0; //edad de cada alumno
   int su=0; //Suma de las edades
   int nu=0; //Numero de alumnos
   float pr=0; //Edad promedio
   nu=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of students"));
   for (int c=1;c<=nu;c=c+1)
   {
     ed=Integer.parseInt(JOptionPane.showInputDialog("Enter  student's age " + c));
     su=su+ed;
     pr=su/nu;
   }
   JOptionPane.showMessageDialog(null ,"The average age of the " + nu + " students is " + pr);
 }
}
