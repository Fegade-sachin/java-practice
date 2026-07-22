package multi.mapImplementation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapImplementation
{
    public static void main(String[] args)
    {
      HashMap<Integer, String>  map=new HashMap();
      map.put(1,"java");
      map.put(2,"html");
      map.put(3,"css");
      System.out.println(map.get(1));
      System.out.println(map.size());
      System.out.println(map.entrySet());
      System.out.println(map.keySet());
      System.out.println(map.values());
      System.out.println(map.values().iterator().next());

        Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
        System.out.println(iterator.next().getKey());
        while(iterator.hasNext())
        {
             Map.Entry<Integer,String> entry=iterator.next();
        }
    }
}
