public class Hourly extends Employee
{
  private double HourlyRate=150;
  private double hours=0.0;

  public Hourly(String name, double hours)
  {
    super(name);
    this.hours=hours;
  }
  @Override
  public  double getPay()
  {
    double pay=HourlyRate*hours;
    return pay;
  }
  public void addHours(double hours)
  {
    this.hours+=hours;
  }
}
