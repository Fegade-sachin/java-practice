package collaction.hashmap_program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* 11. Write a Java program to get a set view of the keys contained in this map. */
public class MapKeySetView
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "apple");
        map.put("b", "banana");
        map.put("c", "cat");
        map.put("d", "dog");
        Set<String> keyset=map.keySet();
        System.out.println("Set view of the keys : "+ keyset);
        for(String key:keyset)
            {
            System.out.println("key: "+key);
            }
    }
}
