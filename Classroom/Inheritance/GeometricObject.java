/*
Ivan Gomez Luis
GeometricObject.java
This is a superclas
*/
import java.util.Date;
import javax.swing.*;
public abstract class GeometricObject
{
 private String color;
 private Boolean filled;//Rellenado
 private Date dateCreated;//Fecha de creacion
 //Metodo abstracto es aquel que se hereda del padre y se utiliza de la manera que  sea mas adecuada en el objeto
 //Methods
 public GeometricObject()
 {
   this.color="purple";
   this.filled=true;
   this.dateCreated = new Date();
 }
 public GeometricObject(String color, boolean filled)
 {
   this.color=color;
   this.filled=filled;
   this.dateCreated=new Date();
 }
  public String getColor()
  {
    return this.color;
  }
  public void setColor(String color)
  {
    this.color=color;
  }
  public Boolean isFilled()
  {
    return this.filled;
  }
  public void setFilled(Boolean filled)
  {
    this.filled=filled;
  }
  public Date getdateCreated()
  {
      return this.dateCreated;
  }
  //Definir el metodo abstracto que puede utilizar
  //circle o rectangle
  public abstract double getArea();

  public abstract double getPerimeter();

}
