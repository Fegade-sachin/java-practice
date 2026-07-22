package collection.Collection_set_Program;
//3. Write a Java program to get the number of elements in a hash set.
import java.util.HashSet;

public class GetNumberOfElement
{
    public static void main(String[] args)
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(22);
        hs.add(33);
        hs.add(44);
        hs.add(55);
        hs.add(66);
        hs.add(77);
        System.out.println(" printing Original HashSet "+hs);
        int size=hs.size();
        System.out.println("number of Element in hash => size= "+size);
    }
}
