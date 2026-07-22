package collaction.arrayList_Program;
//20. Write a Java program to increase an array list size.
import java.util.ArrayList;
public class IncreaseArrayListSize
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Before  ensureCapacity "+list.size());
        list.ensureCapacity(20);
        System.out.println("After ensureCapacity "+list.size());
        System.out.println("ArrayList contents: " + list);
    }
}
