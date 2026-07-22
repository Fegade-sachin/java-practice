package opps.polymorphism.polymorphismpracticeQuestion2;

public class DiffOveMethFromDupliMeth
{
    //Overloaded Methods
    void print(String s)
    {
     System.out.println(s);
    }
    void print(int n)
    {
        for(int i=0;i<=6;i++)
        {
            print(i);
        }
    }
    void print(String s, int n)
    {
        System.out.println(s);
    }
    //------------------------------------------------------------------------------------
/*    int calculate(int a, int b)
    {
        return a + b;
    }
    double calculate(int a, int b)
    {
        return a - b;
    }*/ // ERROR: duplicate method
    public static void main(String[] args)
    {
        DiffOveMethFromDupliMeth df=new DiffOveMethFromDupliMeth();
        df.print("Hello");
    }
}
