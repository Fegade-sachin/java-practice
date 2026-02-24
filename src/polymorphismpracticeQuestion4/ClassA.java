package polymorphismpracticeQuestion4;

import java.io.IOException;

/*32) In the below class A, ‘myMethod()’ has three different forms. All are throwing different exceptions,
     but have same signature. Is it OK?
    Ans: it is not ok ,it will got an compile time error
*/
public class ClassA
{
    //void myMethod() throws IOException
    {
        System.out.println("ONE");
    }

    //void myMethod() throws NumberFormatException
    {
        System.out.println("TWO");
    }

    //void myMethod() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("THREE");
    }
}