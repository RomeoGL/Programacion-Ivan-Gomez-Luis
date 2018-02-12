/*
*/
import javax.swing.JOptionPane;
public class PaymentToMonths
{
  public static void main(String[]args)
  {
    int i; //Contadoe del ciclo de meses
    float p=0;//Cantidad para pagar mensualmente
    float t=0; //Pago total acumulado
    p= 10;
    for (i=1;i<=20;i++)
    {
      JOptionPane.showMessageDialog(null, "En el mes  "+ i +" pagaras "+p);
      t = t+p;
      p = p*2;
    }
      JOptionPane.showMessageDialog(null, "AL final de los 20 meses pagaras "+t);
  }
}
