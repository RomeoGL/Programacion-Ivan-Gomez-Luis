/*Ivan Gomez Luis
WorkPerHour.java
This program calculates how much an employee is paid
Exercise  3.6
*/
import javax.swing.JOptionPane;
public class WorkPerHour
{
  public static void main(String[] args)
  {
    int d=1;//Contador del ciclo de dias
    float ph;//Pago por hora
    int sh=0; //HOras trabajadas en la semana
    int ht; //Horas trabajadas por dia
    float su;//sueldo semanal
    ph=Float.parseFloat(JOptionPane.showInputDialog("Enter the time the employee is charged"));
    do {
      ht =Integer.parseInt(JOptionPane.showInputDialog("Enter how many hours work today eh¿¿the employedd, day "+d));
      sh = sh+ht;
      d = d+1;
    }//End do
    while (d!=7);
    su = ph*sh;
    JOptionPane.showMessageDialog(null, "The employee work "+sh+"Hours and collect $"+su);
  }//end main
}//end program
