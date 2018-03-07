import javax.swing.*;
public class Salaried extends Employee
{
  private double salary;
  public Salaried(String name, double salary)
  {
    super(name);
    this.salary=salary;
  }
  @Override
  public double getPay()
  {
    return this.salary;
  }
  public void printPay(int date)
  {
    JOptionPane.showMessageDialog(null, "Hard codeo");
  }
}
