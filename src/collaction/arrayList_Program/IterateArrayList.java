package collaction.arrayList_Program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/*2. Write a Java program to iterate through all elements in an array list.
 */
public class IterateArrayList
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("purple");
        list.add("orange");
        list.add("yellow");
       System.out.println("printing array list");
       System.out.println(list);
       System.out.println("_____________________________________________________________________");
        System.out.println("Using while Using Iterator: loop ");
        Iterator iterator=list.iterator();
       while(iterator.hasNext())
       {
           System.out.println(iterator.next());
       }
        System.out.println("_____________________________________________________________________");
        System.out.println("Using traditional for loop forward ");
        for(int i=0;i<list.size();i++)
       {
           System.out.println(list.get(i));
       }
        System.out.println("_____________________________________________________________________");
        System.out.println("Using traditional for loop backward ");
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.println(list.get(i));
        }
        System.out.println("_____________________________________________________________________");
        System.out.println("Using for each loop forward direction only  ");
        for(String s: list)
           {
           System.out.println(s);
           }
        System.out.println("_____________________________________________________________________");
        System.out.println("Using ListIterator forward direction while  loop ");
        ListIterator li=list.listIterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
        System.out.println("_____________________________________________________________________");
        System.out.println("Using ListIterator Backward direction while  loop ");
        while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }

    }
}
