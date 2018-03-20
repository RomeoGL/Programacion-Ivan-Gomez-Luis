/*
Ivan Gomez Luis
Serie.java
*/
public class Serie implements Entregable
{
  private String title=" ";
  private int numberOfSeasons=3;
  private Boolean entregado=false;
  private String category=" ";
  private String creator=" ";

  //public Serie() //Un constructor con valores por defecto
//  {
//  }
  public Serie (String title, String creator, Boolean entregado, String category, int numberOfSeasons)
  {
    this.title=title;
    this.creator=creator;
    this.entregado=false;
    this.category=" ";
    this.creator=" ";
    this.numberOfSeasons=3;
  }
  public Serie (String title, String creator, int numberOfSeasons, String category)
  {
    this.title=title;
    this.creator=creator;
    this.category=category;
    this.numberOfSeasons=numberOfSeasons;
  }
  public void setTitle(String title)
  {
    this.title=title;
  }
  public String getTitle()
  {
    return title;
  }
  public void setNumberOfSeason(int numberOfSeasons)
  {
    this.numberOfSeasons=numberOfSeasons;
  }
  public int getNumberOfSeason()
  {
    return numberOfSeasons;
  }
  public void setCategory(String category)
  {
    this.category=category;
  }
  public String getcategory()
  {
    return category;
  }
  public void setcreator(String creator)
  {
    this.creator=creator;
  }
  public String getCreator()
  {
    return creator;
  }
  @Override
  public String toString()
  {
    return "Title: " + getTitle() + "\nNumber of seasons: " + getNumberOfSeason() + "\nCategory: " + getcategory() + "\nCreator" + getCreator();
  }
  public void entregar(Boolean entregado)
  {
    entregado=true;
  }
  public void devolver(Boolean entregado)
  {
    entregado=false;
  }
  public void isEntregado(Boolean entregado)
  {
    entregado=false;
  }
}
