package opps.polymorphism.ex_polymorphism;
// 3) In the below class, is ‘method’ overloaded or duplicated?
public class OverloadWithIntArrayandInt
{
        void method(int  a)// takes a single int

        {
            System.out.println(1);
        }

        void method(int[] a) // takes an array of int

        {
            System.out.println(2);
        }

    public static void main(String[] args)
    {
        OverloadWithIntArrayandInt ob = new OverloadWithIntArrayandInt();
        ob.method(3);
        int arr[]={4,5,6,7,8};
        ob.method(arr );
    }
}
/*
in this class, the method is overloaded, not duplicated.
--- Overloading happens when methods in the same class share the same name
but differ in their parameter list (number or type of parameters)
--- Duplication would mean two methods with exactly the same signature
 (same name, same parameter types, same order), which is not allowed in Java—it would cause a compile-time error.



 */