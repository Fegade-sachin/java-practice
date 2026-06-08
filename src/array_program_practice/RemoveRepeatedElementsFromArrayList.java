package array_program_practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveRepeatedElementsFromArrayList
{
    public static void main(String[] args) {
       ArrayList list=new ArrayList();
       list.add("java ");
       list.add("is awesome");
       list.add(55);
       list.add("is awesome");
       list.add(55);
       list.add('c');
       list.add('c');
       list.add('a');
       list.add("is");
       list.add("awesome");
       HashSet set=new HashSet<>(list);
       list.clear();
       list.addAll(set);
       System.out.println(list);



    }
}
