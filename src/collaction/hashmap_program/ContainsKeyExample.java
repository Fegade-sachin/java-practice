package collaction.hashmap_program;
//7. Write a Java program to test if a map contains a mapping for the specified key.
import java.util.HashMap;

public class ContainsKeyExample
{
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("a", "apple");
        map.put("b", "banana");
        map.put("c", "cat");
        map.put("d", "dog");
        map.put("e", "cat");
        System.out.println(map.containsKey("b"));
        String keyToCheck="b";
        if (map.containsKey(keyToCheck))
        {
            System.out.println("Key " + keyToCheck + " is present in the map");
        }
        else
        {
            System.out.println("Key " + keyToCheck + " is not present in the map");
        }

    }
}
