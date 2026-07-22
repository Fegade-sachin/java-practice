package collaction.arrayList_Program;
/*16. Write a Java program to clone an array list to another array list.*/
import java.util.ArrayList;

public class CloneArrayList
{
    public static void main(String[] args)
    {
        ArrayList list1 = new ArrayList();
       list1.add(10);
       list1.add(20);
       list1.add(30);
       list1.add(40);
       list1.add(50);
       System.out.println("Original lit1"+list1);
       ArrayList list2 =  (ArrayList) list1.clone();
        System.out.println("Cloned list2: " + list2);
        list2.add(70);
        System.out.println(" Original lit1"+list1);
        System.out.println(" after clone list2"+list2);
    }
}
