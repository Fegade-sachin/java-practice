package polymorphismpracticeQuestion3;
// final methods can be overridden but can’t be overloaded? True or False?
//Ans: false
class Finalmethod
{
    public static void main(String[] args)
    {
        System.out.println("Hello ");
    }
}
public class FinalMethodOverriddenOrNot extends Finalmethod
{
    //@Override final method is not override because it is static jvm looking for original main
    public static void main(String[] args)
    {
        System.out.println("Hello World");
    }
}
