package opps.polymorphism.polymorphismpracticeQuestion2;
/*Does Java support operator overloading?
Ans: java does not support operator overloading to maintain simplicity and readability.
 The only exception is the + operator, which is overloaded internally
  for string concatenation. For custom behavior,
  Java relies on methods rather than redefining operators.

 */
public class DoesJavaSupportOperatorOverloading
{
    void  OperatorOverloading()
    {
        System.out.println("Operator Overloading");
        System.out.println("Method Overloading"+"only supports");// + operator, which is overloaded internally
    }
}
