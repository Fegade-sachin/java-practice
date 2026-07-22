package collaction.arrayList_Program;

import java.util.ArrayList;
/*5. Write a Java program to update an array element by the given element.*/
public class UpdateArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("yellow");
        list.add("purple");
        list.add("red");
        list.add("blue");
        list.add("green");
        System.out.println("Original list "+list);
        list.set(0,"pink");
        System.out.println("updated list"+list);

    }
}
