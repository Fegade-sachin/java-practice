package opps.polymorphism.polymorphismpracticeQuestion4;
//39) In the below example, is “methodOfX()” correctly overridden in the sub classes of Class X?
//Ans Yes it is perfectly overridden in the sub classes.
//Access modifiers can be widened (default → protected → public) but they cannot be narrowed.
class X
{
    void methodOfX()
    {
        System.out.println("Class X");
    }
}

class Y extends X
{
    @Override
    protected void methodOfX()//This is valid.
    {
        System.out.println("Class Y");
    }
}

class Z extends Y
{
    @Override
    public void methodOfX()//this is also This is valid.
    {
        System.out.println("Class Z");
    }

    public static void main(String[] args)
    {
        Z z=new Z();
        z.methodOfX();
        Y y=new Y();
        y.methodOfX();
    }
}
//output Class Z
//Class Y