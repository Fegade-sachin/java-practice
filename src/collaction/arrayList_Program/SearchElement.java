package collaction.arrayList_Program;

import java.util.ArrayList;
/*7. Write a Java program to search for an element in an array list.*/
public class SearchElement
{
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("apple");
        list.add("orange");
        list.add("pear");
        list.add("banana");
        list.add("grape");
        list.add("lemon");
      String target="grape";
      if(list.contains(target))
      {
          System.out.println("target value found "+target);
      }
      else
      {
          System.out.println("target value not found "+target);
      }
    }
}
