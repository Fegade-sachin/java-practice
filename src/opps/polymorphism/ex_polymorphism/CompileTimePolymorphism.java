package opps.polymorphism.ex_polymorphism;

public class CompileTimePolymorphism
{
        public static  void  method1()
        {
            System.out.println("method1 without arguments method");
        }
        private static void  method1(byte b)
        {
            System.out.println("method1 byte "+b);
        }
        protected void method1(int i,int j)
        {
            System.out.println("method1 integer "+(i+j));
        }
        void method1(char c, String s)
        {
            System.out.println("method1 "+s +c);
        }
       static void  method1(int i ,long l, int  j)
        {
            System.out.println("method1 int and long two int  "+(l-i));
        }
        final void  method1(float f  ,double d )
        {
            System.out.println("method1 float and double "+(d*f));
        }
       final static  void  method1(int i,boolean b)
        {
            System.out.println("method1 int and boolean  "+i+(b?"true":"false"));
        }

    public static void main(String[] args)
    {
        CompileTimePolymorphism  cp =new CompileTimePolymorphism();
        cp.method1();
        cp.method1((byte) 2);
        cp.method1(3,4);
        cp.method1('c',"java is awesome");
        cp.method1(1,29855,56);
        cp.method1(100.0f,29855.00);
        cp.method1(9,false);

    }

}
