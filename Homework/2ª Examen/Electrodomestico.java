/*
Examen 2ª cuatrimestre
Electrodomestico.java
Laura Josselin Hernandez Garcia
Ivan Gomez Luis
*/
import javax.swing.JOptionPane;
public  class Electrodomestico
{
  private int precioBase=100;
  private String color="Blanco";
  private char consumoEnergetico='F';
  private int peso=5;
  //Un constructor por defecto.
  public Electrodomestico()
  {
  }
  //Un constructor con el precio y peso. El resto por defecto.
  public Electrodomestico(int precioBase, int peso)
  {
    this.precioBase=precioBase;
    this.peso=peso;
  }
  //Un constructor con todos los atributos.
  public Electrodomestico(int precioBase, int peso, String color, char consumoEnergetico)
  {
    this.precioBase=precioBase;
    this.peso=peso;
    this.color=color;
    this.consumoEnergetico=consumoEnergetico;
  }
  //Métodos get de todos los atributos.
  public int getPrecioBase()
  {
    return this.precioBase;
  }
  public String getColor()
  {
    return this.color;
  }
  public char getConsumoEnergetico()
  {
    return this.consumoEnergetico;
  }
  public int getPeso()
  {
    return this.peso;
  }
  private void comprobarConsumoEnergetico()
  {
    if (this.consumoEnergetico>=65 && this.consumoEnergetico<=70)
    {
      JOptionPane.showMessageDialog(null, "La letra es correcta");
    }
    else
    {
      this.consumoEnergetico='F';
      JOptionPane.showMessageDialog(null, "Letra incorrecta, usando letra por defecto");
    }
  }
  private void comprobarColor(String color)
  {
    color=this.color.toUpperCase();
    switch(color)
   {
     case "NEGRO":
     System.out.println("correcto");
     this.color="Negro";
     break;
     case "ROJO":
     System.out.println("correcto");
     this.color="Rojo";
     break;
     case "AZUL":
     System.out.println("correcto");
     this.color="Azul";
     break;
     case "BLANCO":
     System.out.println("correcto");
     this.color="Blanco";
     break;
     case "GRIS":
     System.out.println("correcto");
     this.color="Gris";
     break;
     default:
     System.out.println("Error, usando color por defecto");
     System.out.println(this.color="blanco");
     break;
   }
  }
  public double precioFinal()
  {
    switch(this.consumoEnergetico)
    {
      case 'A':
      this.precioBase=this.precioBase+100;
      break;
      case 'B':
      this.precioBase=this.precioBase+80;
      break;
      case 'C':
      this.precioBase=this.precioBase+60;
      break;
      case 'D':
      this.precioBase=this.precioBase+50;
      break;
      case 'E':
      this.precioBase=this.precioBase+30;
      break;
      case 'F':
      this.precioBase=this.precioBase+10;
      break;
    }
    if (this.peso>=0 && this.peso<=19)
    {
      this.precioBase=this.precioBase+10;
    }
    else if (this.peso>=20 && this.peso<=39)
    {
      this.precioBase=this.precioBase+50;
    }
    else if (this.peso>=50 && this.peso<=79)
    {
      this.precioBase=this.precioBase+80;
    }
    else if (this.peso>=80)
    {
      this.precioBase=this.precioBase+100;
    }
    return this.precioBase;
  }
}
