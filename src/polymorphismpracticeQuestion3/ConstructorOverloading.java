package polymorphismpracticeQuestion3;
/*
Constructor overloading is also one form of the polymorphism. Yes or No?
yes
Constructor overloading is allowed in Java, but too many overloaded constructors are not recommended
because it reduces readability, increases maintenance complexity,
and can create ambiguity. In large applications, Builder Pattern is preferred.
1)Code Becomes Confusing
2) Ambiguity Problem
3) Hard to Maintain (Scalability Issue)
 */

public class ConstructorOverloading
{
    public ConstructorOverloading()
    {
       System.out.println("ConstructorOverloading()"+(11+44));
    }
    public ConstructorOverloading(int a)
    {
        System.out.println("ConstructorOverloading()"+(a+a+a));
    }
    public ConstructorOverloading(int a, int b)
    {
        System.out.println("ConstructorOverloading()"+(a+a+b));
    }
    public ConstructorOverloading(double a)
    {
        System.out.println("ConstructorOverloading()"+(a+a+a));
    }

    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(1);
        ConstructorOverloading obj3 = new ConstructorOverloading(3, 4);
        ConstructorOverloading obj4 = new ConstructorOverloading(4.00);
    }
}
