public class Employee
{
  String n;
  double w;
  int h;
  
  //Constructors
  public Employee(String name, double wage, int hours)
  {
    n=name;
    w=wage;
    h=hours;
  }
  
  //Accessors
  public String getName()
  {
    return n;
  }
  
  public double getWage()
  {
    return w;
  }
  
  public int getHours()
  {
    return h;
  }
  
  public double getWeeklySalary()
  {
    double sal=w*h;
    return sal;
  }
  
  public double getYearlySalary()
  {
    double sal=(w*h)*52;
    return sal;
  }
  
  public String toString()
  {
    return "name: "+n+", wage: "+w+", hours: "+h;
  }
  
  //Mutators
  public void setName(String newName)
  {
    n=newName;
  }
  
  public void setWage(double newWage)
  {
    w=newWage;
  }
  
  public void setHours(int newhour)
  {
    h=newhour;
  }
  
  public void giveRaise()
  {
    w=w+1.0;
  }
}
