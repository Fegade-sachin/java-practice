package static_Instance;

public class StaticInstanceBlock
{
    {
        System.out.println(" before main instance block Initialized");
    }
    static
    {
        System.out.println("Static 1 block Initialized");
    }
    static
    {
        System.out.println("Static 2 block Initialized");
    }
    public StaticInstanceBlock()
    {
        System.out.println("Constructor Initialized");
    }

    public static void main(String[] args) {
        new StaticInstanceBlock();
    }
    static
    {
        System.out.println(" After main Static block Initialized");
    }
    {
        System.out.println("Instance block after main Initialized");
    }
}
