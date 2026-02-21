package polymorphismpracticeQuestion3;
// final methods can be overridden but can’t be overloaded? True or False?
//Ans: false
/*
Does the below program shows polymorphism or not?
Ans ==> NO.
 */

class A
{

}

class B extends A
{

}

class C extends B
{

}

public class MainClass2
{
    public static void main(String[] args)
    {
        A a = new A();

        a = new B();

        a = new C();
    }
}
/*
- Overriding requires methods.
In your classes A, B, and C, there are no methods defined. Since there are no methods to override,
 the program cannot demonstrate method overriding.

- Overriding happens when a subclass provides its own implementation of a method from the parent
class. For example:



 */