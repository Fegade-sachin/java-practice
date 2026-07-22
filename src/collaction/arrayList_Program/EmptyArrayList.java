package collaction.arrayList_Program;
//17. Write a Java program to empty an array list.
import java.util.ArrayList;

public class EmptyArrayList
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("45");
        list.add("6");
        list.add("7");
        list.add(12);
        list.clear();
        System.out.println(" Array list Element "+ list);
        list.clear();//remove all collaction
        System.out.println(" clear method used list Element "+ list);
        System.out.println(" removeAll method called");
        list.removeAll(list);//remove selected collation element
        System.out.println(" Array list Element "+ list);
        System.out.println(list.isEmpty());
    }
}
