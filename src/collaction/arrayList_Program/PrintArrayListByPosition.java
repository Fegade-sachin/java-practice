package collaction.arrayList_Program;
//22. Write a Java program to print all the elements of an ArrayList using the elements' position.
import java.util.ArrayList;

public class PrintArrayListByPosition
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("printing  Array list "+list);
        System.out.println("printing array list by position");
        for(int i=0;i<list.size();i++)
        {
            System.out.print(i+" ="+list.get(i)+" ");
        }

    }
}
