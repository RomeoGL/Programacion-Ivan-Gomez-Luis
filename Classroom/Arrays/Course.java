import javax.swing.*;
public class Course
{
  private String courseName;
  private String students[] = new String[100];
  private int numberOfStudents=0;
  //Contructor
  public Course(String courseName)//<-Parametros
  {
    this.courseName=courseName;
  }
  //Method to get the name of the course
  public String getCourseName()
  {
    return this.courseName;
  }
  //Adds a nuw student to the course
  public void addStudent(String student)
  {
    students[numberOfStudents]=student;
    numberOfStudents++;
  }
  //Returns the students for the course
  public String[] getStudents()
  {
    return this.students;
  }
  //Returns the number of students for the course
  public int getNumberOfStudents()
  {
    return this.numberOfStudents;
  }
  //Drop recibe un studens y lo elimina del arreglo
  //Drop a student fot the course
  public void dropStudent(String student)
  {
    for (int i=0;1<this.getNumberOfStudents();i++)
    {
      if (this.students[i].equalsIgnoreCase(student))
      {
        this.students[i]=null;
      }
    }
  }
  public static void main(String[]args)
  {
    Course coursito = new Course("Programming");
    int opc=0;//variable del menu
    do
    {
      opc=Integer.parseInt(JOptionPane.showInputDialog("....MENU.... \n 1.-Create course \n 2.- Add student \n 3.-Show student \n4.-Drop student \n5.-Exit"));
        switch(opc)
        {
          case 1:
          String course=JOptionPane.showInputDialog("Course name?");
          break;
          case 2:
          String name;
          do
          {
            name=JOptionPane.showInputDialog("Student name?? (or 'q' to exit)");
            if (name.charAt(0)!='q')
            {
              coursito.addStudent(name);
            }
          }
          while ('q' !=name.charAt(0));
          break;
          case 3:
          String[] student= coursito.getStudents();
          String output="";
          for (int i=0;i<coursito.getNumberOfStudents();i++)
          {
            output+= "Student " + (i+1) + " " + student[i] + "\n";
          }
          JOptionPane.showMessageDialog(null, output);
          break;
          case 4:
          name=JOptionPane.showInputDialog("Student's name?");
          coursito.dropStudent(name);
          JOptionPane.showMessageDialog(null, "The student was deleted");
          break;
          case 5:
          JOptionPane.showMessageDialog(null, "Bye see you take care have a nice day", "Bye", JOptionPane.OK_OPTION);
          break;
          default: JOptionPane.showMessageDialog(null, "Option doesn't exit");
        }

    }
    while(opc!=5);

  }

}
