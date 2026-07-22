package collaction.hashmap_program;
//8. Write a Java program to test if a map contains a mapping for the specified value.
import java.util.HashMap;

public class ContainsValueInMap
{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        String ContainValue = "one";
        if(map.containsValue(ContainValue))
        {
            System.out.println("map contains four "+ContainValue);
        }
        else
        {
            System.out.println("map does not contain four "+ContainValue);
        }
    }
}
