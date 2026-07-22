package collaction.hashmap_program;
/* 9. Write a Java program to create a set view of the mappings contained in a map.
* */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetView
{
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a", "apple");
        map.put("b", "banana");
        map.put("c", "cat");
        map.put("d", "dog");
        map.put("e", "eggplant");
        map.put("f", "frog");
        map.put("g", "goose");
        map.put("h", "hamburger");
        map.put("i", "ice cream");
        map.put("j", "jelly bean");
        map.put("k", "killer");
        map.put("l", "lazy dog");
        map.put("m", "mutton");
        map.put("n", "nuts");
        Set< Map.Entry<String,String>> entrySet=map.entrySet();
        System.out.print("Set view of mapping"+entrySet);
        System.out.println("\n");

        for(Map.Entry<String,String> entry:entrySet){
            System.out.print("Key "+entry.getKey()+" value : "+entry.getValue());
        }
    }
}
