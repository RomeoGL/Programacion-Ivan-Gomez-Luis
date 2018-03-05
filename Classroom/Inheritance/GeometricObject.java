/*
Ivan Gomez Luis
GeometricObject.java
This is a superclas
*/
import java.util.Date;
import javax.swing.*;
public class GeometricObject
{
 private String color;
 private Boolean filled;//Rellenado
 private Date dateCreated;//Fecha de creacion

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
}
