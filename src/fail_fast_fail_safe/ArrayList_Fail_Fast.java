package fail_fast_fail_safe;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Fail_Fast
{
    public static void main(String[] args)
    {
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        Iterator il=list.iterator();
        while(il.hasNext())
        {
            Object o=il.next();
            System.out.println(o);
          list.add(o);
           il.remove();
           System.out.println(list);
        }


    }
}
