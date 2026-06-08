package fail_fast_fail_safe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Fail_SafeUsingArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
       ListIterator<Integer> li=al.listIterator();
       while(li.hasNext())
       {
          Integer num=li.next();
          if(num==10) {
              li.add(60);
          }
           // System.out.println(li.next());
       }
       System.out.println(al);
    }
}
