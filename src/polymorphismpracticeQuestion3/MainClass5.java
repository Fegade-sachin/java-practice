package polymorphismpracticeQuestion3;

//27) What will be the output of the below program?

class A1
{
    void myMethod(Object o, Double D) //third call
    {
        System.out.println(1);
    }

    void myMethod(Integer I, Number N) //second call
    {
        System.out.println(2);
    }
}

class B1 extends A1
{
    void myMethod(Float F, Double D)//fourth call
    {
        System.out.println(3);
    }

    void myMethod(Double D, Integer I)//first call
    {
        System.out.println(4);
    }
}
public class MainClass5
{
    public static void main(String[] args)
    {
        B1 b = new B1();

        b.myMethod(11.11, 0000);

        b.myMethod(8778, 3223);

        b.myMethod(2.3*1.2, 4.1*1.4);

        b.myMethod((float)23.56, 21.45);
    }
}
/*
4
2
1
3
 */