package collaction.hashmap_program;
//5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
import java.util.HashMap;

public class CheckMapEmpty
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> map=new HashMap<>();
        if(map.isEmpty())
        {
            System.out.println("map is empty");
        }
        else
        {
            System.out.println("map is not empty");
        }
        map.put(4, "four");
        map.put(5, "five");
        if(map.isEmpty())
        {
            System.out.println("map is empty");

        }
        else
        {
            System.out.println("map is not empty");
        }
    }
}
