/*
*/
import javax.swing.*;
public class Password
{
  private int longitud=8;
  private String password;
  private Boolean isStrong;
  private int caracter;
  private int ma,mi,nu;
  //Metodos
  public void setLongitud(int longitud)
  {
    this.longitud=longitud;
  }
  public int getLongitud()
  {
    return this.longitud;
  }
  public void setPassword(String password)
  {
    this.password=password;
  }
  public String getPassword()
  {
    return this.password;
  }
  public Boolean getIsStrong()
  {
    for (int i=0;i>=longitud;i++)
    {
      caracter=Integer.parseInt(getPassword());
      caracter=getPassword().charAt(i);
      if (caracter>=49 && caracter<=57)
      {
        nu++;
      }
      else if (caracter>=65 && caracter<=90)
      {
        ma++;
      }
      else if (caracter>=97 && caracter<=120)
      {
        mi++;
      }
    }
    if (nu>=5 && ma>=2 && mi>=1)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  //acciones

  public void tamCont()
  {
    int longitud=getPassword().length();
  }

  public void evalu()
  {
    if (longitud==8)
    {
      JOptionPane.showMessageDialog(null, "Esta correcto");
    }
    else
    {
      JOptionPane.showMessageDialog(null, "The size of your password is not correct");
    }
  }
}
