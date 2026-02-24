package polymorphismpracticeQuestion4;

/*36) What will be the output of the below program?

 */

class AB
{
    void methodABC()
    {
        System.out.println(111);
    }

    void methodABC(int i)
    {
        System.out.println(222);
    }
}

class XY extends AB
{
    @Override
    void methodABC(int i)
    {
        System.out.println(333);
    }

    @Override
    void methodABC()
    {
        System.out.println(444);
    }
}

public class MainClass5
{
    public static void main(String[] args)
    {
        AB abc = new XY();
        //XY xy = new AB();

        abc.methodABC(10);

        abc.methodABC();
    }
}
//333
//444