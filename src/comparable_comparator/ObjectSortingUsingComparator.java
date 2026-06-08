package comparable_comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class UsingComparatorClassSort
{
    int id;
    String name;
    public UsingComparatorClassSort(int id, String name)
    {
        this.id = id;
        this.name = name;

    }
    @Override
    public String toString()
    {
        return id+" "+name;
    }
    public int  getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.add(new UsingComparatorClassSort(1, "a"));
        list.add(new UsingComparatorClassSort(8, "d"));
        list.add(new UsingComparatorClassSort(3, "c"));
        list.add(new UsingComparatorClassSort(6, "j"));
        list.add(new UsingComparatorClassSort(5, "e"));
        System.out.println(list);
        Collections.sort( list, new ObjectSortingUsingComparator());
        System.out.println(list);

    }


}
public class ObjectSortingUsingComparator implements Comparator<UsingComparatorClassSort>
{


    public int compare(UsingComparatorClassSort o1, UsingComparatorClassSort o2)
    {
     //  return o1.getId() - o2.getId();
         return  o1.getName().compareTo(o2.getName());
    }
}
