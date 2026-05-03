package multithreading;


abstract class OuterClass
{
    abstract void show();
    abstract void display();
    private abstract class PrivateInnerClass
    {
        abstract void method1();
    }

    class InnerClass extends PrivateInnerClass
    {
        void method1()
        {
            System.out.println(" Inner Class");
        }

    }
}
public class MainClass extends OuterClass
{
   void show()
    {
        System.out.println(" void show() Class");
    }
    void display()
    {
        System.out.println(" void display() Class");
    }


    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.show();
        mainClass.display();
         OuterClass.InnerClass Obj =mainClass.new InnerClass();
         Obj.method1();
         OuterClass.InnerClass obj =mainClass.new InnerClass();
         obj.method1();
    }
}
