package collaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ArrayListSort implements Comparable<ArrayListSort>
{
    int id;
    String name;
    ArrayListSort(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(ArrayListSort o) {
        return this.getId()- o.getId();
    }

    @Override
    public String toString() {
        return "ArrayListSort{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
public class CustomArrayList
{



    public static void main(String[] args)
    {
        ArrayListSort emp1= new ArrayListSort(104,"sachin");
        ArrayListSort emp2= new ArrayListSort(108,"vijay");
        ArrayListSort emp3= new ArrayListSort(107,"ambadas");
        ArrayListSort emp4= new ArrayListSort(102,"vishvajit");
        ArrayListSort emp5= new ArrayListSort(102,"ishwari");
        ArrayList list= new ArrayList<Object>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        System.out.println(list+" ");
        Collections.sort(list);
        System.out.println(list+" ");



    }
}
