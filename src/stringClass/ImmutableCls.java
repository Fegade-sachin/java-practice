package stringClass;

class mutableCls implements Cloneable
{
    int balance;
    mutableCls(int balance)
    {
        this.balance=balance;
    }
    public int  getBalance()
    {
        return balance;
    }
    public void setBalance(int balance)
    {
        this.balance=balance;

    }
//    @Override
//    public String toString() {
//        return "Balance: " + balance;
//    }
//    @Override
    protected mutableCls clone()
        {
            try {
                return (mutableCls) super.clone();
            }
            catch (CloneNotSupportedException e)
            {
                throw new AssertionError();
            }
        }
}
public final class ImmutableCls
{
    private final int id;
    private final String name;
    private final mutableCls balance;
    public ImmutableCls(int id, String name, mutableCls balance)
    {
        this.id = id;
        this.name = name;
        this.balance=balance.clone();
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public mutableCls getBalance()
    {
        return  balance.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException
    {
        mutableCls b=new mutableCls(10000);
        ImmutableCls cls  =new ImmutableCls(11,"sachin",b);
        System.out.println("before modifying ");
        System.out.println(cls.getBalance().getBalance() );
        System.out.println(cls.getName());
        System.out.println(cls.getId());
        System.out.println("after modifying ");
        System.out.println(cls.getBalance().getBalance());
        System.out.println(cls.getName());
        System.out.println(cls.getId());


    }
}
