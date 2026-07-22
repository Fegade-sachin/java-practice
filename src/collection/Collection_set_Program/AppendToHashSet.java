package collection.Collection_set_Program;

import java.util.HashSet;

public class AppendToHashSet
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<String>();
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");
        hs.add("e");
        hs.add("f");
        hs.add("g");
        hs.add("h");
        System.out.println(" printing Original HashSet "+hs);
        hs.add("append");
        System.out.println(" printing after append HashSet "+hs);
    }
}
