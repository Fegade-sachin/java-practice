package collaction.arrayList_Program;
//14. Write a Java program that swaps two elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class SwapsArrayListElement
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(42);
        list.add(23);
        list.add(1);
        list.add(22);
        System.out.println("Before swaps Array element "+list);
        Collections.swap(list,0,list.size()-1);
        System.out.println("After swaps Arraylist element "+list);

    }
}
