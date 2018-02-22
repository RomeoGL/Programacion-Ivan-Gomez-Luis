/*
Ivan Gomez Luis
Password.java
*/
import javax.swing.*;
public class Password
{
  private int longitud=8;
  private String password;
  public Boolean isStrong,setSize;
  private int caracter;
  private int ma,mi,nu;
  private int i;
  //Metodos
  public void setLongitud(int longitud)
  {
    //Asigna la longitud del password
    this.longitud=longitud;
  }//End setLongitud
  public int getLongitud()
  {
    return this.longitud;
  }//Ent getLongitud
  public void setPassword(String password)
  {
    this.password=password;
  }//End setPassword
  public String getPassword()
  {
    return this.password;
  } //end getPassword
  //acciones
  public boolean setSize()
  {
    int longitud=getPassword().length();
    if (longitud==8)
    {
      JOptionPane.showMessageDialog(null, "Correct password size");
      return true;
    }
    else
    {
      JOptionPane.showMessageDialog(null, "The size of your password is not correct \nPlease try again");
      return false ;
    }//end else
  }
  //Checa la contraseña
  public Boolean getIsStrong()
  {
    /*if (setSize()!=true)
    {
      JOptionPane.showMessageDialog(null, "Error, shutdown" , "Error" , JOptionPane.WARNING_MESSAGE);
    }*/
    if (setSize()!=false)
    {
      for (i=0;i<=longitud-1;i=i+1)
      {
        //caracter=Integer.parseInt(getPassword());
        caracter=getPassword().charAt(i);
        if (caracter>=48 && caracter<=57)
        {
          nu++;
        }//end if
        else if (caracter>=65 && caracter<=90)
        {
          ma++;
        }//end if
        else if (caracter>=97 && caracter<=122)
        {
          mi++;
        }//end if
      }//end for
    }//end else
    i=0;
    if (nu==5 && ma==2 && mi==1)
    {
      mi=0;
      nu=0;
      ma=0;
      return true;
    }//end if
    else
    {
      mi=0;
      nu=0;
      ma=0;
      return false;
    }//end else
  }//End getIsStrong
  //Manda un mensaje de error
  public void error()
  {
    JOptionPane.showMessageDialog(null, "Error, shutdown" , "Error" , JOptionPane.WARNING_MESSAGE);
  }//end error

}//End all
