package polymorphismpracticeQuestion4;

//31) What will be the output of the following program?
class A
{
    static void methodOne()//static method can't Override
    {
        System.out.println("AAA");
    }
}

class B extends A
{
    static void methodOne()
    {
        System.out.println("BBB");
    }
}

public class MainClass1
{
    public static void main(String[] args)
    {
        A a = new B();//if the reference is parent class method should be called parent class
                    // if the method called child class Overriding should be happen
                    // if the method called child class Overriding should be happen

        a.methodOne();
    }
}
