/*
Ivan Gomez Luis
RectangleGO.java
*/
public class RectangleGO extends GeometricObject
{
  private double width;
  private double height;
  public RectangleGO()
  {
  }
  public RectangleGO(double width, double height)
  {
    this.width = width;
    this.height=height;
  }
  public RectangleGO(double width, double height, String color, boolean filled)
  {
    super(color,filled);

    this.width=width;
    this.height=height;

  }
  public double getWidth()
  {
    return this.width;
  }
  public void setWidth(double width)
  {
    this.width=width;
  }
  public double getHeight()
  {
    return this.height;
  }
  public void setHeight(double height)
  {
    this.height=height;
  }
  public double getArea()
  {
    return this.height*this.width;
  }
  public double getPerimeter()
  {
    return ((this.height*2)+(this.width*2));
  }
}
