package collaction.hashmap_program;
//6. Write a Java program to get a shallow copy of a HashMap instance.
import java.util.HashMap;
import java.util.Map;

public class ShallowCopyHashMap
{
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        System.out.println("Original hash map : "+map);
        //shallow copy using clone
        HashMap<String,String> copyMap = (HashMap<String,String>)map.clone();
        System.out.println(" Copy hash map : "+copyMap);
        System.out.println(map.get("key1"));

        // Shallow copy using putAll()
        HashMap<String, String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(" Copy hash map2 : "+map2);
        // using constructor
        HashMap<String,String> copyMap2 = new HashMap<>(map2);
        System.out.println(" Copy hash map2 : "+copyMap2);

    }


}
