package polymorphism;

 abstract class abstractClass
{

        {
            System.out.println("instance block");
        }
        public abstractClass()
        {
            System.out.println("abstract class constructer ");
        }
        public abstract void meth1();
        abstract void meth2();
        protected abstract void meth7();

        private void meth3()
        {
            System.out.println("this is private meth abstract class");
        }
        public void meth4()
        {
            System.out.println("this is public abstract concrete method");
        }
        void meth5()
        {
            System.out.println("default method abstract class");
            meth3();
        }
        public  static void meth6()
        {
            //meth3();//you can not call instance method
            System.out.println("static method called");
        }

        public static void main(String[] args)
        {

        }

}
public class PolymorphismRulesAccessModifiers extends abstractClass//concrete classB extend parent ClassA which is not abstract
{
    public void meth1() {
        System.out.println("provide  an implementation public meth1");
    }

    void meth2() {
        System.out.println("provide  an implementation default meth1");
    }

    protected void meth7() {
        System.out.println("provide an implementation default meth1");
    }

    public static void main(String[] args) {
        PolymorphismRulesAccessModifiers bobj = new PolymorphismRulesAccessModifiers();
        bobj.meth1();
        bobj.meth2();
        bobj.meth7();

    }
}
