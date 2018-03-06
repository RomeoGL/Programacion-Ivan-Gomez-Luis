import javax.swing.*;
public class Salaried extends Employee
{
  private double salary;
  public Salaried(String name, double salary)
  {
    super(name);
    this.salary=salary;
  }
  public double getPay()
  {
    return 0.0;//Hard code
  }
  public void printPay(int date)
  {
    JOptionPane.showMessageDialog(null, "Hard codeo");
  }
}
