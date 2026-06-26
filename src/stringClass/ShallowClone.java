package stringClass;

import polymorphism.NewClass;

import javax.naming.Name;

class AddressCaffe {
	String city;
    public  AddressCaffe(String city) {
        this.city = city;
    }
}
public class ShallowClone implements Cloneable
{
    String Name;
    AddressCaffe addressCaffe;
    public  ShallowClone(String name, AddressCaffe address)
    {
        this.Name = name;
        this.addressCaffe = address;
    }
    public String GetName()
    {
        return this.Name;
    }
    public AddressCaffe GetAddressCaffe()
    {
        return this.addressCaffe;
    }
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowClone shallowClone = new ShallowClone("ShallowClone", new AddressCaffe("Reulgoan"));
        System.out.println(shallowClone.addressCaffe.city);
        ShallowClone shallowClone1 = (ShallowClone)shallowClone.clone();
        shallowClone1.addressCaffe.city = "pune";
        System.out.println(shallowClone1.addressCaffe.city);
    }

}
