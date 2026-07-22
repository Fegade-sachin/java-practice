package opps.polymorphism.polymorphismpracticeQuestion3;

//26) Is the following program written correctly? If yes, what will be the output?

class AA
{
    public AA(int i)
    {
        System.out.println(myMethod(i));//253+252=505
    }

    int myMethod(int i)
    {
        return ++i + --i;
    }
}

class BB extends AA
{
    public BB(int i, int j)
    {
        super(i*j);

        System.out.println(myMethod(i, j));//12, 21 =return value is printed;
    }

    int myMethod(int i, int j)
    {
        return myMethod(i*j); //call parent method and then return 505
    }
}

public class MainClass4
{
    public static void main(String[] args)
    {
        BB b = new BB(12, 21);
    }
}