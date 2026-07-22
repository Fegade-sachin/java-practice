package collaction.arrayList_Program;

import java.util.ArrayList;

/*4. Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
public class RetrieveElement
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("orange");
        list.add("yellow");
        list.add("purple");
        int index = 2; // retrieving element at index 2
        String listItem=list.get(index);
        System.out.println(listItem);
        System.out.println("Element at index " + index + ": " + listItem);
    }
}
