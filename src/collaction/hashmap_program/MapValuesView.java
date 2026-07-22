package collaction.hashmap_program;
// 12. Write a Java program to get a collection view of the values contained in this map.
import java.util.Collection;
import java.util.HashMap;

public class MapValuesView
{
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("a", "apple");
        map.put("b", "banana");
        map.put("c", "cat");
        map.put("d", "dog");
        System.out.println("Original map: "+map);
        Collection<String> values = map.values();
        System.out.println("Collection view of Values: "+values);
        for (String value : values) {
            System.out.println(" values "+ value);
        }
    }
}
