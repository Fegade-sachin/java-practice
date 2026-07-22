package collaction.arrayList_Program;

import java.util.ArrayList;
/*Write a Java program to create an array list, add some colors (strings) and print out the collection.
 */
public class ColorList
{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("purple");
        colors.add("orange");
        System.out.println("Colors in the list: " + colors);
    }
}
