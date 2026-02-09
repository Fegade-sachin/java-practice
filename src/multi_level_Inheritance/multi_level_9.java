package multi_level_Inheritance;
class person
{
    void speak()
    {
        System.out.println("speak");
    }
}
class Employee extends person
{
  void work()
  {
    System.out.println("Work");
  }
}
class maneger extends Employee
{
    void manage()
    {
        System.out.println("Manage");
    }
}
public class multi_level_9
{
    public static void main(String[] args)
    {
        maneger ma=new  maneger();
        ma.manage();
        ma.work();
        ma.speak();
    }
}
