package collection.Collection_set_Program;
//6. Write a Java program to clone a hash set to another hash set
import java.util.HashSet;

public class ConvertHashSetToArray {
    public static void main(String[] args) {
      HashSet<String> hs=new HashSet<String>();
        hs.add("java");
        hs.add("is");
        hs.add("awesome");
        String arr[]=new String [hs.size()];
        hs.toArray(arr);
        System.out.println(" convert HashSet Into array Size");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
