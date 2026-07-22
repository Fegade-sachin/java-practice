package collaction.Collection_set_Program;
//2. Write a Java program to iterate through all elements in a hash list.
import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Java");
        hs.add("is ");
        hs.add("awesome");
        hs.add("and");
        hs.add("it");
        hs.add("cool");
        hs.add("for");
        hs.add("Programing");
        Iterator i=hs.iterator();
        while(i.hasNext())
        {
            System.out.print((String)i.next()+" ");
        }
        System.out.println("using ForEach loop HashSet ");
        for(String str:hs)
            {
            System.out.print(str+" ");
            }

    }
}
