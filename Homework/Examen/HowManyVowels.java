/*
Ivan Gomez Luis
HowManyVowels.java
Del siguiente String “La lluvia en Sevilla es una
maravilla” cuenta cuantas vocales hay en total (recorre
el String con charAt).
*/
import javax.swing.*;
public class HowManyVowels
{
  public static void main(String[] args)
  {
    String frase="La lluvia en Sevilla es una maravilla";//Frase a analizar
    int a=0,e=0,i=0,o=0,u=0;//Cuantas vocales hay de cada una
    int j=0,c=0; //Contadores
    char opc;
    int vocales=0;//Total de vocales
    JOptionPane.showMessageDialog(null, "De la siguiente frase: \n-" + frase +  "-\nTe dire cuantas vocales hay escritas en ella");
    do
    {
      j=j+1;
      opc=frase.charAt(j);
      switch(opc)
      {
        case 'a':
        a++;
        break;
        case 'e':
        e++;
        break;
        case 'i':
        i++;
        break;
        case 'o':
        o++;
        break;
        case 'u':
        u++;
        break;
      }//End switch
    }//End do-while
    while(j!=36);
    vocales=(a+e+i+o+u);
    JOptionPane.showMessageDialog(null, "En la frase anterior hay " + vocales + " vocales. \n "+ a + " son vocales A \n "+ e + " son vocales E \n "+ i + " son vocales I  \n "+ o + " son vocales O  \n "+ u + " son vocales U");
  }//End  main
}//End program
