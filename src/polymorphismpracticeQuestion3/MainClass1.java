package polymorphismpracticeQuestion3;
//23) What will be the output of the following program?

class X
{
    int method(int i)
    {
        return i *= i;
    }
}

class Y extends X
{
    double method(double d)
    {
        return d /= d;
    }
}

class Z extends Y
{
    float method(float f)
    {
        return f += f;
    }
}

public class MainClass1
{
    public static void main(String[] args)
    {
        Z z = new Z();

        System.out.println(z.method(21.12));//Every float value is by default double that why y method called
    }
}