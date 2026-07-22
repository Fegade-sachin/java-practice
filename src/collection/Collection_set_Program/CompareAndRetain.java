package collection.Collection_set_Program;
//11. Write a Java program to compare two sets and retain elements that are the same.
import java.util.HashSet;

public class CompareAndRetain
{
    public static void main(String[] args)
    {
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("b");
        hs1.add("c");
        hs1.add("d");
        hs1.add("g");
        HashSet<String> hs2 = new HashSet<>();
        hs2.add("b");
        hs2.add("c");
        hs2.add("d");
        hs2.add("g");
        hs1.retainAll(hs2);
        System.out.println("Common Element between hs1 and hs2 "+hs1);

    }
}
