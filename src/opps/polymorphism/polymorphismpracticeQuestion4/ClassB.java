package opps.polymorphism.polymorphismpracticeQuestion4;
// program can not run syntax error accore at that time
//33) Can you identify the error in below code snippet?

class ClassAA
{
    void myMethod()
    {
        System.out.println("Super Class");
    }
}
public class ClassB extends ClassAA
{
//      @Override
//  void myMethod() throws SQLException // this method does not throw SQLException
    {
        System.out.println("Sub Class");
    }
    //error of this program  main method is not written and that's why it is not thrown an any  type of exception
    //if i write main method or call then it got compile time exception this method does not throw any SQl exception
    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.myMethod();
    }
}