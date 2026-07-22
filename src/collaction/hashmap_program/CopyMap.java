package collaction.hashmap_program;

import java.util.HashMap;
import java.util.Set;

//3. Write a Java program to copy all mappings from the specified map to another map.
public class CopyMap
{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        System.out.println("Before copy"+map);
        HashMap<Integer,String> map2=new HashMap<>();
        map.putAll(map2);
        System.out.println("After copy"+map2);
        HashMap<Integer,String> map3=new HashMap<>(map);
        System.out.println("By Copy Constructor After copy"+map3);


    }
}
