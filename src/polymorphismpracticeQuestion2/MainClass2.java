package polymorphismpracticeQuestion2;


    //17) What will be the output of the below program?


    class A
    {
        public A(int i)//called A()
        {
            System.out.println(1);//1
        }

        public A()//main called
        {
            this(10);

            System.out.println(2);// 2
        }

        void A()//main called
        {
            A(10);

            System.out.println(3);
        }

        void A(int i)//  method called A(10) called
        {
            System.out.println(4);
        }
    }


    public class MainClass2
    {
        public static void main(String[] args)
        {
            new A().A();

        }
    }
    // output 1 ,2 ,4 ,3

