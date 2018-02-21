/*
BMIOOP.java
Ivan Gomez Luis
This class calculates the Body Mass Index
*/
import javax.swing.JOptionPane;
public class BMIOOP
{
  private String name;
  private int age;
  private double weigth;
  private double heigth;
  private final double KILOGRAMS_PERPOUND=0.45359237;
  private final double METERS_PER_INCH=0.0254;
  private double bmi;

  //methods-Actions
  public void setName(String name)
  {
    this.name=name;
  }
  public String getName()
  {
    return this.name;
  }
  public void setAge(int age)
  {
    this.age=age;
  }
  public int getAge()
  {
    return this.age;
  }
  public void setWeigth(Double weigth)
  {
    this.weigth=weigth;
  }
  public Double getWeigth()
  {
    return this.weigth;
  }
  public void setHeigth(Double heigth)
  {
    this.heigth=heigth;
  }
  public Double getHeigth()
  {
    return this.heigth;
  }
  public double getBmi()
  {
    double bmi=this.weigth*KILOGRAMS_PERPOUND/((this.heigth*METERS_PER_INCH)*(this.heigth*METERS_PER_INCH));
    return Math.round(bmi*100)/100;
  }
  //metohd to evaluate BMI and return a message
  public String getStatus()
  {
    double bmi= getBmi();
    if (bmi<16)
    {
      return "You are seriously underweight";
    }
    else if (bmi<18)
    {
      return "You are underweight";
    }
    else if (bmi<24)
    {
      return "You are normal weight";
    }
    else if (bmi<29)
    {
      return "You are overweight";
    }
    else if (bmi<35)
    {
      return "You are  seriusly overweight";
    }
    else
    {
      return "You are gravely overweight";
    }
  }


}
