package collection.Collection_set_Program;
//8. Write a Java program to convert a hash set to a tree set.
import java.util.HashSet;
import java.util.TreeSet;

public class ConvertHashSetTreeSet
{
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");
        hs.add("e");
        hs.add("f");
        System.out.println("Hash Set Element"+hs);
        TreeSet ts = new TreeSet(hs);
        System.out.println("Tree Set Element"+ts);

    }
}
