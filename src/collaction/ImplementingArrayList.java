package collaction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ImplementingArrayList
{
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        System.out.println(list);
        for(Object obj : list)
            {
            System.out.print(obj);
            }
        System.out.println("for loop implementation");
        for(int i=0;i<list.size();i++)
            {
                System.out.print(list.get(i)+" ");
            }
        System.out.println("iterator implementation");
        Iterator<Object> it = list.iterator();
        while(it.hasNext())
            {

                System.out.print(it.next()+" ");
            }

        System.out.println("");
        ListIterator<Object> lit = list.listIterator();

        while(lit.hasNext())
            {

                System.out.print(lit.next()+" ");
                lit.set(100);
              //  lit.next();
                lit.add(200);
            }
        System.out.println("\nAfter set method: " + list);


    }
}
