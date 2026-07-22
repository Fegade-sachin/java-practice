package collaction.arrayList_Program;

import java.util.ArrayList;

//15. Write a Java program to join two array lists.
public class JoinTwoArrayList
{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        System.out.println("Array list1"+list1);
        System.out.println("Array list2"+list2);
        ArrayList joinTwoArrayList = new ArrayList(list1);
        joinTwoArrayList.addAll(list2);
        System.out.println("joined list : "+joinTwoArrayList);

    }
}
