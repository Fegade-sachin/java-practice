package polymorphism;
// 6) What will be the output of the following program?


    class X
    {
        void method(int a)
        {
            System.out.println("ONE");//this int method call here its overriding happens here
        }

        void method(double d)
        {
            System.out.println("TWO");
        }
    }

    class Y extends X
    {
        @Override
        void method(double d)
        {
            System.out.println("THREE");
        }
    }

    public class MainClass2
    {
        public static void main(String[] args)
        {
            new Y().method(100);
        }
    }



