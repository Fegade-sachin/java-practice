package fail_fast_fail_safe;

import java.util.ArrayList;
import java.util.Iterator;

public class Fail_fast
{

    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");
        Iterator il=al.iterator();
        while(il.hasNext())
        {
            System.out.println(il.next());
            while (il.hasNext())
            {
                System.out.println(il.next());
              //  al.add(55f);
                while (il.hasNext())
                {
                    System.out.println(il.next());
                    al.add(55f);
                }
            }
        }
        System.out.println(al);
    }
}
