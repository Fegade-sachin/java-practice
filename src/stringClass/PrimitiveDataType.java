package stringClass;

public class PrimitiveDataType
{

    public static void main(String[] args)
    {
        int a=10;//stores value 10
        System.out.println("a=>"+a);

        System.out.println(a+" "+(a==a)+" "+a);
        //When we modify a primitive variable

        a=20;//is replaced by 20
        //their value cannot be changed in the same memory location.

        System.out.println(a+" "+(a==a)+" "+a);
        System.out.println( "a=>"+a);
        //Java creates a new value and replaces the old value.


        //Primitive types are immutable because their values cannot be modified;



        //when reassigned, a new value replaces the old value rather than changing the existing value.

        //imp:Technically, primitive data types are not objects, so the term immutability
        //is not strictly applied to them like it is for classes such as String.


    }

}
