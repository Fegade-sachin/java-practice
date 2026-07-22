package opps.polymorphism.ex_polymorphism;
//    5) In the below Class X, is ‘method’ properly overloaded?
public class ClassX
{

    class X
    {
        int method(int i, int d)
        {
            return i+d;
        }

        static int method(int i, double d)
        {
            return (int)(i+d);
        }

        double method(double i, int d)
        {
            return i+d;
        }

        static double method(double i, double d)
        {
            return i+d;
        }
    }

}
/*
Properly overloaded (different parameter lists)
 */