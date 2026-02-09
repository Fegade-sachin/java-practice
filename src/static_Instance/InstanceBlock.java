package static_Instance;

public class InstanceBlock
{
    {  //does not need to call it called automatically whenever constructor call
        System.out.println("instance block Initialized before main first instance block");
    }
    {
        System.out.println("instance block Initialized after main second instance block");
    }//every instance block called before constructor
    InstanceBlock()
    {
        System.out.println(" Constructor Initialized");
    }
    public static void main(String[] args) {
        InstanceBlock ib =new InstanceBlock();
        new InstanceBlock();//how many constructor call that many times instance block called
    }
    { //whenever we Initialized constructor that time instance block called once for
        System.out.println("instance block Initialized after main");
    }
}
