package collaction.arrayList_Program;
//12. Write a Java program to extract a portion of an array list.
import java.util.ArrayList;
import java.util.List;

public class ExtractArrayListPortion
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        System.out.println("Original ArrayList"+list);
       List<String> portion=list.subList(0,4);
        System.out.println("After SubList"+portion);

    }
}
