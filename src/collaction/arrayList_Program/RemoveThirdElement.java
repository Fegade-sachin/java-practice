package collaction.arrayList_Program;

import java.util.ArrayList;
/*6. Write a Java program to remove the third element from an array list.*/
public class RemoveThirdElement
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}
