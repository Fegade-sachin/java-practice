package collaction.arrayList_Program;

import java.util.ArrayList;
import java.util.Collections;

//9. Write a Java program to copy one array list into another.
public class CopyArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(12);
        list.add(13);
        list.add(5);
        list.add(26);
        list.add(27);
        list.add(33);
        list.add(34);
        list.add(35);
        list.add(36);
        // Method 1: Using constructor
        System.out.println("Original collaction :"+list);
        ArrayList<Integer> list2=new ArrayList<>(list);
        System.out.println("Copy list2 (constructor): "+list2);
        //method 2: USING AddAll()
        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(list);
        System.out.println("Copy list3 addAll): "+list3);
        // Method 3: Using Collections.copy()
        ArrayList<Integer> list4=new ArrayList<>(Collections.nCopies(list.size(),0));
        Collections.copy(list4,list);
        System.out.println("Copy list4 ( Collections.copy(): "+list4);



    }
}
