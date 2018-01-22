/*****
*Author: Ivan gomez Luis
*Name: MetersToInches.java
*This program converts meters to inches.
*****/
import java.util.Scanner;
public class MetersToInches
{
  public static void main (String[]args)
  {
    Double CM; //Cantidad de metros que require
    Double PG; //Pulgadas que debe pedir
    Scanner in= new Scanner(System.in);
    System.out.println ("Hola por favor, ingresa la cantidad de metros que utilizaras.");
    CM= in.nextDouble();
    PG=CM/0.0252;
    System.out.println ("La cantidad de pulgadas que tendras que pedir es de: " + PG);
  } //End main
} //End MetersToInches
