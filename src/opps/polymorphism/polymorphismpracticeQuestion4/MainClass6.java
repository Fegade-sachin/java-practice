package opps.polymorphism.polymorphismpracticeQuestion4;

//40) What will be the output of the following program?


class ABCD
{
    String myMethod(String s)//JAVA134JAVA134
    {
        return s+s;
    }
}

class PQR extends ABCD
{
    String myMethod(String s, double d)
    {
        return myMethod((s+d));//JAVA134.23
    }
}

class WXYZ extends PQR
{
    String myMethod(String s, double d, int i)
    {
        return myMethod(s, d+i);//JAVA 134.23
    }
}

public class MainClass6
{
    public static void main(String[] args)
    {
        WXYZ xyz = new WXYZ();

        System.out.println(xyz.myMethod("JAVA", 23.23, 111));//JAVA134JAVA134
    }
}
