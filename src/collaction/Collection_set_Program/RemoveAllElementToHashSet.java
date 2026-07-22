package collaction.Collection_set_Program;
//12. Write a Java program to remove all elements from a hash set.

import java.util.HashSet;
/*
12. Write a Java program to remove all elements from a hash set.
*/
public class RemoveAllElementToHashSet
{
    public static void main(String[] args)
    {
        HashSet<String> hs3=new HashSet<>();
        hs3.add("b");
        hs3.add("c");
        hs3.add("d");
        hs3.add("g");
        System.out.println(" Element in hs3"+ hs3);
        hs3.clear();
        System.out.println("hash set after Clear "+hs3);
        System.out.println(" is hash set empty"+ hs3);

    }
}
