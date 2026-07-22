package collaction.arrayList_Program;
//19. Write a Java program for trimming the capacity of an array list.
import java.util.ArrayList;

public class TrimArrayList
{
	public static void main(String[] args)
	{
        ArrayList list = new ArrayList(19);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println("Before  trim Array list  "+list.size());
        list.trimToSize();
        System.out.println("After trim Array list   "+list.size());
    }
}
