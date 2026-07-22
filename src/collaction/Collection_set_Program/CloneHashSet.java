package collaction.Collection_set_Program;
//7. Write a Java program to convert a hash set to an array.
import java.util.HashSet;

public class CloneHashSet
{
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<String>();
         hs1.add("1");
         hs1.add("2");
         hs1.add("3");
         hs1.add("4");
         hs1.add("5");
         HashSet<String> hs2=(HashSet<String>)hs1.clone();
         System.out.println("Original object "+hs1);
         System.out.println("Clone object "+hs2);
    }
}
