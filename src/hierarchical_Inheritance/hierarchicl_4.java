package hierarchical_Inheritance;
class Employee
{
    int id =55;
    String name ="Sachin";
    float salary=700000;

    void work( )
    {
        System.out.println("Employee "+id+" "+name+" "+salary);
    }
}
class developer extends Employee
{

    void  code()
    {
System.out.println("Developer develop Idea");
    }
}
class tester extends Employee
{
    void  test()
    {
        System.out.println("tester Test code ");
    }
}
public class hierarchicl_4
{
 public static void main(String[] args)
    {
        tester t=new tester();
        t.test();
        t.work();
        developer d=new developer();
        d.work();
        d.code();
    }
}
