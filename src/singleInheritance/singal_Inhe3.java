package singleInheritance;

class persen1
{
    void  meth1()
    {
        System.out.println("meth1 class persen1");
        System.out.println("------------------------------------------------------------");
    }
}
class persen2 extends persen1
{
    void  meth2()
    {
        System.out.println("meth2 class persen2");
        System.out.println("hello java persen2");
        System.out.println("------------------------------------------------------------");
    }
}

public class singal_Inhe3 {
    public static void main(String[] args) {

    persen2 pobj = new persen2();
     pobj.meth1();
     pobj.meth2();
}
}