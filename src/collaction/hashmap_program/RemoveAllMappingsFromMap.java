package collaction.hashmap_program;

import java.util.HashMap;
import java.util.Map;
//4. Write a Java program to remove all mappings from a map
public class RemoveAllMappingsFromMap
{
    public static void main(String[] args)
    {
        Map<Integer,String> map=new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        System.out.println("Before Clear All Element"+map);
        map.clear();
        System.out.println("After Clear All Element"+map);


    }
}
