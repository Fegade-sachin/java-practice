package Encapsulation;
class BankAccount
{
    //if I made variable as final you can not change a data after initialization.
    private double balance;// Declare instance variables as private so they cannot be accessed directly from
    //outside the class.
    //only the  class itself can access balance.
    private int  age;

    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        //instead  of direct access ,we use method to read or update data.
        if(balance < 0)//validation This allows validation and security checks.
        this.balance = balance;
        //THIS ALLOW VALIDATION AND SECURITY  CHECK.
    }

    public void setAge(int age)
    {
        if(age >=18)
        this.age = age;
        else
        {
            System.out.println("Invalid Age");//protects object from invalid data.x
        }
    }
}
public class EncapsulationSecurityProvide
{

}
