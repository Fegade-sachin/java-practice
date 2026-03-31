package hierarchical_Inheritance;
class Account
{
    void OppenAccount()
    {
        System.out.println("OppenAccount");
    }
}
class CorrentAccount extends Account
{
    void withdraw()
    {
        System.out.println("CorrentAccount");
    }
}
class SavingsAccount extends Account
{
    void addInterest()
    {
        System.out.println("SavingsAccount");

    }
}

public class hierarchicl_8
{
    public static void main(String[] args)
    {
        SavingsAccount s = new SavingsAccount();
        s.OppenAccount();
        s.addInterest();

        CorrentAccount c = new CorrentAccount();
        c.OppenAccount();
        c.withdraw();
    }
}
