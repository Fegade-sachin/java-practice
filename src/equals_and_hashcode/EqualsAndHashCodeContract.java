package equals_and_hashcode;

import java.util.Objects;

class Employee
{
    public String name;
    public int age;
    public Employee(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object obj)
    {
       if(this == obj)
           return true;
       if(obj == null)
           return false;
       if(getClass() != obj.getClass())
           return false;

        Employee other = (Employee) obj;
        return age == other.age && Objects.equals(name, other.name);

    }
    public int HashCode()
    {
       return Objects.hash(name,age);
    }
}
public class EqualsAndHashCodeContract
{
    public static void main(String[] args)
    {
        Employee eobj=new Employee("sachin",18);
        Employee eobj2=new Employee("sachin",18);
        Employee eobj1=new Employee("vishwajit",8);
        System.out.println(eobj.equals(eobj2));
        System.out.println(eobj.equals(eobj1));
        System.out.println(eobj==eobj1);
        System.out.println(eobj==eobj2);
        System.out.println(eobj.equals(eobj1));

    }
}
