/*********
*Ivan Gomez Luis
*TemperatureConverter.java
*This program converts from Fahrenheit to Celciuos.
**********/
public class TemperatureConverter{
  public static void main (String[] args ){
    final double FREEZING_POINT=32.0;
    final double CONVERSION_FACTOR=5.0/9.0;
    double fahrentheit=50;
    double celcius=0;
    celcius=CONVERSION_FACTOR * (fahrentheit-FREEZING_POINT);
    System.out.println (fahrentheit+" degrees Fahrenheit = " +celcius+ " degrees Celcius");
  }
}
