package collaction.Collection_set_Program;
//4. Write a Java program to empty an hash set.
import java.util.HashSet;
import java.util.Iterator;

public class TestEmptyHashSet
{
    public static void main(String[] args)
    {
        HashSet hs=new HashSet();
        if(hs.isEmpty())
        {
            System.out.println("Empty HashSet");
        }
        else
        {
            System.out.println("is not empty HashSet ");
        }
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        System.out.println("====================================================");
        if(hs.isEmpty())
        {
            System.out.println("Empty HashSet");
        }
        else
        {
            System.out.println("is not empty HashSet ");
        }
    }
}
