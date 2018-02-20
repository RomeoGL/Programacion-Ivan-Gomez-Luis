import javax.swing.*;
public class TestBMIOOP
{
  public static void main(String[] args)
  {
    BMIOOP person;
    person=new BMIOOP();
    person.setName(JOptionPane.showInputDialog("Enter your name"));
    person.setAge(Integer.parseInt(JOptionPane.showInputDialog("How old are you?")));
    person.setWeigth(Double.parseDouble(JOptionPane.showInputDialog("Enter your WEIGHT in pounds")));
    person.setHeigth(Double.parseDouble(JOptionPane.showInputDialog("Enter your HEIGHT in inches")));
    person.getBmi();
    if (person.getBmi()<16)
      {
        JOptionPane.showMessageDialog(null, person.getName() + " At your " + person.getAge() + " years \nYou are seriously underweight");
      }
    else if (person.getBmi()<18)
      {
        JOptionPane.showMessageDialog(null, person.getName() + " At your " + person.getAge() + " years \nYou are underweight");
      }
    else if (person.getBmi()<24)
      {
        JOptionPane.showMessageDialog(null, person.getName() + " At your " + person.getAge() + " years \nYou are normal weight");
      }
    else if (person.getBmi()<29)
      {
        JOptionPane.showMessageDialog(null, person.getName() + " At your " + person.getAge() + " years \nYou are overweight");
      }
    else if (person.getBmi()<35)
      {
        JOptionPane.showMessageDialog(null, person.getName() + " At your " + person.getAge() + " years \nYou are  seriusly overweight");
      }
    else
      {
        JOptionPane.showMessageDialog(null, person.getName() + " At your " + person.getAge() + " years \nYou are gravely overweight");
      }
  }
}
