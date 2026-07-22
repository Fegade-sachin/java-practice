package opps.encapsulation;
class EncapsulationClass
{
    private String name ; //if i declare final we need to initialized it distractedly or constructor throw
    private double balance;
    public EncapsulationClass(String name, double balance) {
        this.name = name;
        if(balance < 0)//Ensures valid state
        {
          //  throw new IllegalArgumentException("balance cannot be negative");
        }
        this.balance = balance;
    }//initialized object

    public String getName()//used for get the value
    {
        return name;
    }
    public void setName(String name)//if i declare variable as final we can not provide implementation throw setters
    {
        this.name = name;
    }
    public double getBalance()
        {
        return balance;
        }
        public  void setBalance(double balance)
        {
            if(balance < 0)//Ensures valid state
            {
               // throw new IllegalArgumentException("balance cannot be negative");
                //adding validation in setter makes it safer,but the object is still mutable.
                //object can change any time  multiple variable dependency problem
                //thread sefty issue.
            }
            this.balance = balance;
        }
}
    public class DiffConstructorAndSetter
    {
        public static void main(String[] args   ) {
           EncapsulationClass e=new EncapsulationClass("abc", -12.34);//object will not created.

            EncapsulationClass f=new EncapsulationClass("ilc", 15.24);
            f.setBalance(-12.34);//constructor protected it stat,but setter destroyed consistency later

            EncapsulationClass en = new EncapsulationClass("sachin",6546.55);//each constructor can modify only once
            //otherwise you nooed to create new object if you want to Reassign value you need to creat another object
            System.out.println(en.getName());
            en.setName("sham");
            System.out.println(en.getName());
            en.setName("krishna");
            System.out.println(en.getName());

        }
    }

