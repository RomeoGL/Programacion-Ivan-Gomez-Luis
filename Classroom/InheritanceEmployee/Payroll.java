import javax.swing.*;
public class Payroll
{
  public static void main(String[] args)
  {
    //Salaried
    String name=JOptionPane.showInputDialog("Salaried's name");
    double salary=Double.parseDouble(JOptionPane.showInputDialog("Salaried's name"));
    Employee sasuke = new Salaried(name, salary);
    JOptionPane.showMessageDialog(null, sasuke.getPay(), "Salary" , JOptionPane.OK_OPTION);
    //Hourly
    name=JOptionPane.showInputDialog("Salaried's name");
    double hours=Double.parseDouble(JOptionPane.showInputDialog("Hours worked"));

    Employee sakura = new Hourly(name, hours);
    JOptionPane.showMessageDialog(null, "Sakura's pay $" + sakura.getPay(), "Salary" , JOptionPane.OK_OPTION);

    //Commissioned
    Commissioned shikamaru = new Commissioned("shikamaru");

    shikamaru.addSales(550);
    shikamaru.addSales(1250);
  }
}
