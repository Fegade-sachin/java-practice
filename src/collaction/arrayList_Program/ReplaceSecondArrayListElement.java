package collaction.arrayList_Program;

import java.util.ArrayList;

public class ReplaceSecondArrayListElement
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add(45);
        list.add("89");
        list.add(53);
        System.out.println("Before  replace Array list "+list);
        list.set(1,55);
        System.out.println("After replace Array list "+list);
    }
}
