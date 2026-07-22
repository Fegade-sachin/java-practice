package collaction.Collection_set_Program;

import java.util.ArrayList;
import java.util.HashSet;
//10. Write a Java program to compare two hash set.
public class CompareHashSet
{
    public static void main(String[] args)
    {
        HashSet<String> hs1 = new HashSet<String>();
        hs1.add("b");
        hs1.add("c");
        hs1.add("d");
        hs1.add("g");
        HashSet<String> hs2 =new HashSet<>();
        hs2.add("b");
        hs2.add("c");
        hs2.add("d");
        hs2.add("e");
        hs2.add("f");

       boolean conten=hs1.containsAll(hs2);
        System.out.println("Hash Set Element are equals "+conten );
        System.out.println("Hash Set Element equals "+hs1.equals(hs2));
        System.out.println("Hash Set Element retainAll "+hs1.retainAll(hs1));
       HashSet<String> common =new HashSet<>(hs1);
        common.retainAll(hs2);
        System.out.println("Hash Set Common Element "+common);
       HashSet<String>  unique=new HashSet<>(hs1);
        unique.removeAll(hs2);
        System.out.println("Hash Set Unique "+unique);
        HashSet<String> Uniquehs2=new HashSet<>(hs2);
        Uniquehs2.removeAll(hs1);
        System.out.println("Hash Set Unique "+Uniquehs2);


    }
}
