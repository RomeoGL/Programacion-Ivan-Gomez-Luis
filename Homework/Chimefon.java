/*
Ivan Gomez Luis
Chimefon.java

exercise 2.9
*/
import javax.swing.JOptionPane;
public class Chimefon
{
  public static void main (String[]args)
  {
    int ti; //Tiempo
    String di; //Tipo de dia
    String tu; //Turno
    double pag; //Pago por el tiempo
    double imp; //Impuesto
    double tot; //Total que se va a pagar
    pag=0;
    imp=0;
    ti=Integer.parseInt(JOptionPane.showInputDialog("Enter the time you call hard"));
    if (ti<=5)
    {
      pag=ti*1;
    }
    else if (ti>=6 && ti<=8)
    {
      pag=(((ti-5)*0.80)+5.00);
    }
    else if (ti>=9 && ti<=10)
    {
      pag=(((ti-8)*70)+7.40);
    }
    else if (ti>=10)
    {
      pag=(((ti-10)*50)+8.80);
    }
    di=JOptionPane.showInputDialog("Enter the type of day (Working day or Sunday)");
    switch(di)
    {
      case "Sunday":
        imp=pag*.3;
      break;
      case "Working day":
        tu=JOptionPane.showInputDialog("Enter the turn of the call, Morning or Evening");
        switch(tu)
        {
          case "Morning":
            imp=pag*.15;
          break;
          case "Evening":
            imp=pag*.10;
          break;
        }
      break;
    }
    tot=(pag+imp);
    JOptionPane.showMessageDialog(null, "Chimefon \n\n" + "Minutes spoken " + ti + "\nTime paymet $" + pag + "\nTaxes $" + imp + "\nTotal: $" + tot );
  }
}
