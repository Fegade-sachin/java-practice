package collaction.arrayList_Program;
/*13. Write a Java program to compare two array lists.*/
import java.util.ArrayList;

public class CompareArraylist
{
    public static void main(String[] args)
    {
        ArrayList list1= new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(13);
        list1.add(4);
        list1.add(15);
        ArrayList list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        list2.add(13);
        list2.add(4);
        list2.add(15);
        ArrayList list3 = new ArrayList();
        list3.add(1);
        list3.add(2);
        list3.add(13);
        list3.add(4);
        list3.add(15);
        list3.add(11);
        System.out.println("compare list1 equals list2 "+list1.equals(list2));
        System.out.println("compare list1 equals list3 "+list1.equals(list3));
        System.out.println("compare list2 equals list3 "+list1.equals(list3));
    }
}
