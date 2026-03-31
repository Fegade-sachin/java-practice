package five_main_ways_create_objcet;

public class UsingCloneMeth implements Cloneable
{
    void method()
    {
        System.out.println("method called using clone method or clone Object");
    }
    public static void main(String[] args) throws CloneNotSupportedException
    {
        UsingCloneMeth obj1 = new UsingCloneMeth();
        UsingCloneMeth obj2 = (UsingCloneMeth) obj1.clone();
        obj2.method();
    }
//    protected UsingCloneMeth clone()
//    {
//        try {
//
//            return  (UsingCloneMeth) super .clone();
//        }
//        catch (Exception e)
//            {
//            throw new AssertionError(e);
//            }
//    }
}
