package encapsulation;

import java.util.*;

final public class ImmutabilityClass
{
    private final List<String> immutability;
   public ImmutabilityClass(List<String>  immutability)
    {
        this.immutability = new ArrayList<> (immutability);
    }
    public List<String> getImmutability()
    {
        return new ArrayList<>(immutability);
    }

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("sacchin");
        ImmutabilityClass l=new ImmutabilityClass(list);
        System.out.println(l.getImmutability());
    }
}
