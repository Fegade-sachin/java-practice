package collaction.Collection_set_Program;
//5. Write a Java program to test if a hash set is empty or not.
import java.util.HashSet;

public class TestHasSetEmpty
{
    public static void main(String[] args)
    {
        HashSet hs=new HashSet();
        System.out.println("hs size= "+hs.size()+" is Empty"+hs.isEmpty());
    }
}
