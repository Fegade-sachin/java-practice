package collaction.hashmap_program;
//Write a Java program to associate the specified value with the specified key in a HashMap.
import java.util.HashMap;
import java.util.Set;

public class AssociateKeyValue
{
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "101");
        map.put("B", "102");
        map.put("C", "103");
        map.put("D", "104");
        System.out.println("map "+map);
        Set<String> keys = map.keySet();
       map.put("e","105");
       System.out.println("keys "+keys);
       System.out.println("map"+keys +" "+map.values());
       System.out.println("map "+map);
    }
}
