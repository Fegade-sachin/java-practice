package multipulInheritance;

interface InterfaceA {
    void display();//before java 8 we can achieve multiple inheritance only this type
    void show();
}

interface InterfaceB {
    void display();
}
public class MultiInheritance implements InterfaceA, InterfaceB
{
    @Override
    public void display() {
        System.out.println("Display method implemented once");
    }
    public void show()
    {
        System.out.println("this is InterfaceA method");
    }

    public static void main(String[] args)
    {
        MultiInheritance obj = new MultiInheritance();
        obj.display(); 	//we can call but you don't no which interface method is call
        obj.show();//we can achieve
        //both are method are working
        InterfaceA a = obj;// this way we can can only interfaceA method
        InterfaceB b = obj;
        a.show();//we can call it in this way
        //b.show();// we can not call interfaceA method

        a.display(); // calls the same implementation
        b.display(); // also calls the same implementation
    }

}
