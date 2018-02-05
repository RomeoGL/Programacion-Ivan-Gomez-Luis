/*
Ivan Gomez Luis
StudyTrip.java
This program calcutes how much will be pain for a student trip
Exercise 2.8
*/
import javax.swing.JOptionPane;
public class StudyTrip
{
  public static void main (String[]args)
  {
    int na; //Numero de alumnos que realizan el viaje
    float pa; //Pago por alumno
    float tot; //Total que va a pagar a la empresa por el viaje
    na=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of studens attending the trip"));
    if (na<30)
    {
      tot=4000;
      pa=(4000/na);
      JOptionPane.showMessageDialog(null, "Study Trip\n\n" + "Number of students: " + na + "\nPrice for studenst: $" + pa + "\nTotal price for trip: $" + tot);
    }
    else if (na>30 && na<49)
    {
      pa=95;
      tot=pa*na;
      JOptionPane.showMessageDialog(null, "Study Trip\n\n" + "Number of students: " + na + "\nPrice for studenst: $" + pa + "\nTotal price for trip: $" + tot);
    }
    else if (na>50 && na<99)
    {
      pa=70;
      tot=pa*na;
      JOptionPane.showMessageDialog(null, "Study Trip\n\n" + "Number of students: " + na + "\nPrice for studenst: $" + pa + "\nTotal price for trip: $" + tot);
    }
    else if (na>=100)
    {
      pa=65;
      tot=pa*na;
      JOptionPane.showMessageDialog(null, "Study Trip\n\n" + "Number of students: " + na + "\nPrice for studenst: $" + pa + "\nTotal price for trip: $" + tot);

    }
  }
}
