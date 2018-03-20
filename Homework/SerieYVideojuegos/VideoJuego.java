/*
Ivan Gomez Luis
VideoJuego.java
*/
public class VideoJuego implements Entregable
{
  private String title=" ";
  private int estimatedHours=10;
  private Boolean entregado=false;
  private String category=" ";
  private String company=" ";

  public VideoJuego()
  {
  }
  public VideoJuego(String title, int estimatedHours, Boolean entregado, String category, String company)
  {
    this.title=title;
    this.estimatedHours=estimatedHours;
    this.entregado=false;
    this.category=" ";
    this.company=" ";
  }
  public VideoJuego(String title, int estimatedHours, String category, String company)
  {
    this.title=title;
    this.estimatedHours=estimatedHours;
    this.category=" ";
    this.company=" ";
  }
  public void setTitle(String title)
  {
    this.title=title;
  }
  public String getTitle()
  {
    return title;
  }
  public void setEstimatedHours(int estimatedHours)
  {
    this.estimatedHours=estimatedHours;
  }
  public int getEstimatedHours()
  {
    return estimatedHours;
  }
  public void setCategory(String category)
  {
    this.category=category;
  }
  public String getCategory()
  {
    return category;
  }
  public void setCompany(String company)
  {
    this.company=company;
  }
  public String getCompany()
  {
    return company;
  }
  @Override
  public String toString()
  {
    return "Title: " + getTitle() + "\nEstimate hours: " + getEstimatedHours() + "\nCategory" + getCategory() + "\nCompany: " + getCompany();
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
