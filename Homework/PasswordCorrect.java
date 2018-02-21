/*
*/
import javax.swing.*;
public class PasswordCorrect
{
  public static void main(String[] args)
  {
    Password person;
    person=new Password();
    boolean a;
    person.setPassword(JOptionPane.showInputDialog(null, "Ingresa tu Password"));
    person.tamCont();
    person.evalu();
    a=person.getIsStrong();
    if (a==true)
    {
      JOptionPane.showMessageDialog(null, "Tu contraseña es segura");
    }
    else if (a=false)
    {
      JOptionPane.showMessageDialog(null, "Tu contraseña no es segura");
    }
  }
}
