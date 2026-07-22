package collaction.arrayList_Program;
//10. Write a Java program to shuffle elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList
{
    public static void main(String[] args)
    {
     ArrayList<Integer> list = new ArrayList<Integer>();
     list.add(27);
     list.add(33);
     list.add(34);
     list.add(35);
     list.add(41);
     list.add(36);
     list.add(75);
     list.add(80);
     list.add(90);
     System.out.println("Before shuffling an arrayList"+list);
     Collections.shuffle(list);
     System.out.println("After shuffling an arrayList"+list);

    }
}
