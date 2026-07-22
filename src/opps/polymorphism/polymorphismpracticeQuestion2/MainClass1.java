package opps.polymorphism.polymorphismpracticeQuestion2;
// 14) What will be the output of this program?


    class SuperClass
    {
        void superClassMethod(Number n)
        {
            System.out.println("From Super Class superClassMethod method");
        }
    }

    class SubClass extends SuperClass
    {
        void superClassMethod(Double d)
        {
            System.out.println("From Sub Class");
        }
    }

    public class MainClass1
    {
        public static void main(String[] args)
        {

            SuperClass sub = new SubClass();

            sub.superClassMethod(123321);
        }
    }

