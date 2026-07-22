package collaction.hashmap_program;
//2. Write a Java program to count the number of key-value (size) mappings in a map.
import java.util.HashMap;

public class CountKeyValueInMap
{
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "101");
        map.put("B", "102");
        map.put("C", "103");
        map.put("D", "104");
        map.put("E", "105");
        int mapsize=map.size();
        System.out.println("number of key value pair is : "+mapsize);
    }
}
