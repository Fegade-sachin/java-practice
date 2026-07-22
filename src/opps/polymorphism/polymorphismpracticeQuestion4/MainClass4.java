package opps.polymorphism.polymorphismpracticeQuestion4;
/*
35) What will be the outcome of the following program?
Ans : The program will not terminate normally. It will result in a \
StackOverflowError at runtime due to infinite recursive calls between
 methodABC() and methodXYZ()
 */
class ABC
{
    void methodABC()
    {
        new XYZ().methodXYZ();
    }
}

class XYZ extends ABC
{
    void methodXYZ()//method call continues
    {
        methodABC();
    }
}

public class MainClass4
{
    public static void main(String[] args)
    {
        new ABC().methodABC();
    }
}