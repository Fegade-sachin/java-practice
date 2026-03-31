package singleInheritance;


    class ClassA
    {
        void meth1()
        {
            int a= 5;
            a+=10;
            System.out.println("meth1 from ClassA");
            System.out.println("10*2");

            System.out.println(a);//15
            System.out.println(a-- - --a);//2//13
            System.out.println( "this is the value of after substraction "+(++a));//14
            System.out.println("this is meth "+(a++ + ++a));//30//16
        }
    }
    class ClassB extends ClassA
    {
        void meth2()
        {
            System.out.println("meth2 from ClassB");
            System.out.println("10*2");
        }
    }
public class singal_Inhe1
{
    public static void main(String[] args)
    {
        ClassB bobj = new ClassB();
        bobj.meth1();
        bobj.meth2();
    }



}
