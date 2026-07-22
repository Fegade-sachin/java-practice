package arrays.array_program_practice;

import java.util.HashMap;
import java.util.Map;
/*19. Designing a vending machine
Program to create a vending machine interface based on a given set of guidelines. This is a popular OOAD
(Object-Oriented Analysis and Design) problem that is frequently asked in Java interviews.*/
class Product
{
    String name;
    int price;
    Product(String name,int price)
    {
        this.name=name;
        this.price=price;
    }
    public String getName()
    {
        return this.name;
    }
    public int getPrice()
    {
        return this.price;
    }
}
class Inventory
{
    private Map<Product, Integer> stock = new HashMap<>();
 public void  addProduct(Product p,int qty)
 {
     stock.put(p, stock.getOrDefault(p, 0) + qty);
 }
 public boolean isAvailable (Product p)
 {
     return stock.getOrDefault(p,0)>0;
 }
    public void dispense(Product p) {
        if (!isAvailable(p)) throw new RuntimeException("Out of stock!");
        stock.put(p, stock.get(p) - 1);
    }
}
class Payment
{
   private int balance=0;
   public void insertCoin(int amount)
    {
        balance=balance+amount;
    }
    public boolean hasEnough(int price)
        {
        return balance>=price;
        }
        public int returnChange(int price)
        {
            int change=balance-price;
            balance=0;
            return change;
        }
}
class VendingMachine
{
    private Inventory inventory=new Inventory();
    private Payment payment=new Payment();
   public void addProduct(Product p ,int qty )
   {
       inventory.addProduct(p,qty);
   }
   public void insertCoin(int amount)
   {
       payment.insertCoin(amount);
   }
   public void selectProduct(Product p)
   {
       if(!inventory.isAvailable(p))
       {
           System.out.println("product out of stock");
           return;
       }
       if(!payment.hasEnough(p.getPrice()))
           {
           System.out.println("Insufficient funds!");
            return;
           }
       inventory.dispense(p);
       int change=payment.returnChange(p.getPrice());
       System.out.println("dispensed:"+p.getName());
       if(change>0)
           {
               System.out.println("💰 Change returned: " + change + " cents");
           }
   }
}
public class VendingMachineDemo
{
    public static void main(String[] args)
    {
        VendingMachine vm = new VendingMachine();
        Product Coke = new Product("Coke",25);
        Product Pepsi = new Product("Pepsi",35);
        vm.addProduct(Coke,5);
        vm.addProduct(Pepsi,2);
        vm.insertCoin(50);
        vm.selectProduct(Coke);


    }
}
