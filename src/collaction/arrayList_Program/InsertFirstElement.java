package collaction.arrayList_Program;

import java.util.ArrayList;
/*3. Write a Java program to insert an element into the array list at the first position.
 */
public class InsertFirstElement
{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("orange");
        list.add("yellow");
        list.add("purple");
        System.out.println("Before insertion:");
        System.out.println(list.get(0));
        list.set(0,"cyan");
        System.out.println("After insertion:");
        System.out.println(list.get(0));
        System.out.println(list);

    }
}
