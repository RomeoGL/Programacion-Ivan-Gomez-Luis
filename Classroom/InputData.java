/***********************
Ivan Gomez Luis
InputData.java
This program displays a personalized Hello greeting
***********************/
import java.util.Scanner;
public class InputData
{
  public static void main (String[] agrs)
  {
    Scanner userData = new Scanner(System.in);
    String name;
    System.out.println ("Enter your name");
    name = userData.nextLine();
    System.out.println ("Hello " + name + "!");
    }
}
