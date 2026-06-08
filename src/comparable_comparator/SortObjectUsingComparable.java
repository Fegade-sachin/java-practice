package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class UsingComparable implements Comparable<UsingComparable>
{
    int id;
    String name;
    UsingComparable(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public String toString()
    {
        return this.id + " " + this.name;
    }
    public  int compareTo(UsingComparable o)
    {
        return this.id-o.id;
       // return this.name.compareTo(o.name);

    }
}
public class SortObjectUsingComparable
{
    public static void main(String[] args)
    {
       ArrayList ali=new ArrayList();
       ali.add(new UsingComparable(18,"E"));
       ali.add(new UsingComparable(14,"N"));
       ali.add(new UsingComparable(13,"C"));
       ali.add(new UsingComparable(14,"D"));
       ali.add(new UsingComparable(11,"A"));

       System.out.println(ali);
       Collections.sort(ali);
       System.out.println(ali);
       Iterator li= ali.iterator();
       while(li.hasNext())
       {
           System.out.println(li.next());

       }


    }
}
