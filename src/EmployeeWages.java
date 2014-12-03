public class EmployeeWages
{
  public static void main(String[] args)
  {
    Employee roge = new Employee("Roger", 9.0, 40);
    Employee suzi = new Employee("Susie", 11.0, 42);
    Employee suse = new Employee("Susan", 11.5, 43);
    
    System.out.println(roge);
    roge.getWeeklySalary();
    System.out.println("\n weekly salary: "+roge);
    roge.getYearlySalary();
    System.out.println("\n annual salary: "+roge);
    
    
    System.out.println(suzi);
    
    System.out.println(suse);
    suse.getWeeklySalary();
    System.out.println("\n weekly salary: "+suse);
    suse.getYearlySalary();
    System.out.println("\n annual salary: "+suse);
    suse.giveRaise();
    System.out.println(suse);
  }
}
