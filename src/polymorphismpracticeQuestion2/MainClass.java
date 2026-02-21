package polymorphismpracticeQuestion2;

public class MainClass
{
    static void method(Integer i)
    {
        System.out.println(1);
    }

    static void method(Double d) {
        System.out.println(2);
    }

    static void method(Number n)
    {
        System.out.println(4);
    }

    static void method(Object o) {
        System.out.println(5);
    }

    public static void main(String[] args) {
        method((short) 12);
    }
}
/* output :4
The output is 4 because the argument (short) 12 is autoboxed into a Short object.
Since Short extends Number, the compiler selects the method(Number n) overload as
the most specific match. That’s why the output is 4.

*/