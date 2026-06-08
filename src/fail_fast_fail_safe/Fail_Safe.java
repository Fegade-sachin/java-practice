package fail_fast_fail_safe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Fail_Safe
{
    public static void main(String[] args)
    {
       CopyOnWriteArrayList al= new CopyOnWriteArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        Iterator<Object> il= al.iterator();
        while(il.hasNext())
        {
            Object num=il.next();

           if(num.equals(2)) {
               al.add(6);
           }
           al.add(45);
        }
        System.out.println(al);
    }
}
