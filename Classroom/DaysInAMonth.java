/******
Ivan Gomez Luis
DaysAMonth.java
This program finds the number of days in a month
*******/
import javax.swing.JOptionPane;
public class DaysInAMonth
{
  public static void main(String[] args)
  {
    int numberOfDaysInAMonth = 0;
    String monthOfYear;
    int year;
    int modYear;
    monthOfYear=JOptionPane.showInputDialog("Enter your month");
    switch(monthOfYear)
    {
      case "January":
        numberOfDaysInAMonth=31;
        JOptionPane.showMessageDialog(null, "The month of " + monthOfYear+ " has " + numberOfDaysInAMonth + " days.");
      break;
      case "February":
      year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year"));
      modYear=(year%4);
      if (modYear!=0)
      {
        numberOfDaysInAMonth=28;
      }
     else
        numberOfDaysInAMonth=29;
        JOptionPane.showMessageDialog(null, "The month of " + monthOfYear+ " has " + numberOfDaysInAMonth + " days.");
      break;
      case "March":
        numberOfDaysInAMonth=31;
        JOptionPane.showMessageDialog(null, "The month of " + monthOfYear+ " has " + numberOfDaysInAMonth + " days.");
      break;
      case "April":
        numberOfDaysInAMonth=30;
        JOptionPane.showMessageDialog(null, "The month of " + monthOfYear+ " has " + numberOfDaysInAMonth + " days.");
      break;
      case "May":
        numberOfDaysInAMonth=31;
        JOptionPane.showMessageDialog(null, "The month of " + monthOfYear+ " has " + numberOfDaysInAMonth + " days.");
      break;
      case "June":
        numberOfDaysInAMonth=30;
        JOptionPane.showMessageDialog(null, "The month of " + monthOfYear+ " has " + numberOfDaysInAMonth + " days.");
      break;
      case "July":
        numberOfDaysInAMonth=31;
        JOptionPane.showMessageDialog(null, "The month of " + monthOfYear+ " has " + numberOfDaysInAMonth + " days.");
      break;
      case "August":
        numberOfDaysInAMonth=31;
        JOptionPane.showMessageDialog(null, "The month of " + monthOfYear+ " has " + numberOfDaysInAMonth + " days.");
      break;
      case "September":
        numberOfDaysInAMonth=30;
        JOptionPane.showMessageDialog(null, "The month of " + monthOfYear+ " has " + numberOfDaysInAMonth + " days.");
      break;
      case "October":
        numberOfDaysInAMonth=31;
        JOptionPane.showMessageDialog(null, "The month of " + monthOfYear+ " has " + numberOfDaysInAMonth + " days.");
      break;
      case "November":
        numberOfDaysInAMonth=30;
        JOptionPane.showMessageDialog(null, "The month of " + monthOfYear+ " has " + numberOfDaysInAMonth + " days.");
      break;
      case "December":
        numberOfDaysInAMonth=31;
        JOptionPane.showMessageDialog(null, "The month of " + monthOfYear+ " has " + numberOfDaysInAMonth + " days.");
      break;
      default:
      JOptionPane.showMessageDialog(null, "Error, month invalid");
        break;
    }
  }
}
