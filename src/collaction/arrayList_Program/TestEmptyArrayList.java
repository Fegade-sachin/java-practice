package collaction.arrayList_Program;
//18. Write a Java program to test whether an array list is empty or not.
import java.util.ArrayList;

public class TestEmptyArrayList
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        if(list.isEmpty())
        {
            System.out.println("Empty ArrayList");
        }
        else
        {
            System.out.println("ArrayList is not empty");
        }
        list.add("Hello");
        list.add("World");
        list.add("java");
        list.add("is");
        list.add("awesome");
        System.out.println("Check after value add to the ArrayList");
        if (list.isEmpty())
        {
            System.out.println("Empty ArrayList");
        }
        else
        {
            System.out.println("ArrayList is not empty");
        }

    }
}
