package collaction.hashmap_program;

import java.util.HashMap;

//10. Write a Java program to get the value of a specified key in a map.
public class GetValueByKey
{
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a", "apple");
        map.put("b", "banana");
        map.put("c", "cat");
        map.put("d", "dog");
        map.put("e", "cat");
        String getToKey="b";
        String value=map.get(getToKey);
        if(value!=null) {
            System.out.println("value for key  : " + getToKey + " is : " + value);
        }
        else {
            System.out.println("value for key  : " + getToKey + " is null");
        }
    }
}
