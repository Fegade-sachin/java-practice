package collaction.arrayList_Program;
//11. Write a Java program to reverse elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayElement
{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(13);
        list.add(4);
        list.add(15);
        list.add(61);
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        System.out.println("before Reverse ArrayList"+list);
        Collections.reverse(list);
        System.out.println("After Reverse ArrayList"+list);
    }
}
