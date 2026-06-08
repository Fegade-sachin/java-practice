package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorClass
{
    int id;
    String name;
    public ComparatorClass(int id, String name)
    {
        this.id = id;
        this.name = name;
    }


    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String  toString() {
        return id + " " + name;
    }

    public static void main(String[] args) {

        ArrayList li = new ArrayList();
        li.add(new ComparatorClass(5, "b"));
        li.add(new ComparatorClass(7, "a"));
        li.add(new ComparatorClass(2, "c"));
        li.add(new ComparatorClass(5, "d"));
        li.add(new ComparatorClass(1, "e"));
        System.out.println(li);
        Collections.sort( li, new ComparatorSort());
        System.out.println(li);
    }
}
class ComparatorSort implements Comparator<ComparatorClass>
{
    public int compare(ComparatorClass o1, ComparatorClass o2)
    {
        //return o1.getName().compareTo(o2.getName());
       return o1.getId() - o2.getId();
    }
}