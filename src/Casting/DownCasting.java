package Casting;
class parentClass
{
    void print()
    {
        System.out.println("parentClass");
    }
}
public class DownCasting extends parentClass
{
    void print()
    {
    System.out.println("DownCasting");
    }
    public static void main(String[] args)
    {
//        parentClass obj = new DownCasting();
//        DownCasting obj1 = (DownCasting) obj;// Downcasting
//        obj1.print(); // Access subclass-specific method

//        DownCasting a= (DownCasting) new parentClass();// Runtime error: ClassCastException
//        a.print();
/*
Downcasting is the process of converting a reference of a parent class type into a child class type.
It’s the opposite of upcasting, which converts a child class reference into a parent class reference.

- Parent object → Parent reference is just normal usage (no casting needed).

- Child object → Parent reference is upcasting.

- Parent reference → Child reference is downcasting.

 */
        }
    }


