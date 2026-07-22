package opps.inheritance.hierarchical_Inheritance;
class person
{
    void detail()
    {
        String name = "sachin";
        System.out.println("Name is: " + name);
    }
}
class student extends person
{
    void study()
    {

        System.out.println("Student study regularly");
    }
}
class Teacher extends person
{
    void teach()
    {
        System.out.println("Teacher teach  everything what student want");
    }
}
public class hierarchicl_7
{
    public static void main(String[] args)
    {
        Teacher t = new Teacher();
        t.teach();
        t.detail();

        student s = new student();
        s.study();
        s.detail();
    }
}
