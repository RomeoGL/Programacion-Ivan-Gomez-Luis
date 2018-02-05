/*
Ivan Gomez Luis
Consultations.java
This program calculates how much is paid for a consultation
Exercise 2.10
*/
import javax.swing.JOptionPane;
public class Consultations
{
  public static void main(String[] args)
  {
    int nc; //Numero de consulta
    float cc;//Costo de la cita
    float tot; //costo del tratamiento
    nc=Integer.parseInt(JOptionPane.showInputDialog("Enter the medical contaltation number"));
    if (nc<=3)
    {
      cc=(200);
      tot=(nc*200);
      JOptionPane.showMessageDialog(null, "You will pay for this medical consultation $" + cc);
      JOptionPane.showMessageDialog(null,"You paid for the treatment: $" +  tot);
    }
    else if (nc>=4 && nc<=5)
    {
      cc=(150);
      tot=((nc*150)+600);
      JOptionPane.showMessageDialog(null, "You will pay for this medical consultation $" + cc);
      JOptionPane.showMessageDialog(null, "You paid for the treatment: $" + tot);
    }
    else if (nc>=6 && nc<=8)
    {
      cc=(100);
      tot=((nc*100)+900);
      JOptionPane.showMessageDialog(null, "You will pay for this medical consultation $" + cc);
      JOptionPane.showMessageDialog(null, "You paid for the treatment: $" + tot);
    }
    else if (nc>=9)
    {
      cc=(50);
      tot=(nc*50)+1200;
      JOptionPane.showMessageDialog(null, "You will pay for this medical consultation" + cc);
      JOptionPane.showMessageDialog(null, "You paid for the treatment: $" +  tot);
    }
  }
}
