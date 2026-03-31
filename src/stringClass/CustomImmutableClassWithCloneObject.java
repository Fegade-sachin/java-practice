package stringClass;

import java.util.Objects;

class Address implements Cloneable
{
    String city;

     public Address(String city)
     {
     this.city=city;
     }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }

    @Override
    protected Address clone()
    {
        try {
            return (Address) super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    public String toString()
    {
        return city;
    }

}
public final class CustomImmutableClassWithCloneObject
{
    private final int number;
    private final String name;
    private final Address address;

    public CustomImmutableClassWithCloneObject(int number, String name, Address address)
    {
        this.number = number;
        this.name = name;
        this.address=address.clone();
    }
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Address getAddress()
    {
       // return address;
        return  address.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address a=new Address("Berlin");
        CustomImmutableClassWithCloneObject obj=new CustomImmutableClassWithCloneObject(1, "sham", a);
        a.setCity("pune");
        System.out.println(obj.getNumber());
        System.out.println(obj.getName());
        System.out.println(obj.getAddress());

    }
}
