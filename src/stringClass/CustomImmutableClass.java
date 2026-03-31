package stringClass;

import java.util.ArrayList;
import java.util.List;

public final class CustomImmutableClass implements Cloneable
{
    private final int id;
    private final String name;
    private final List<String> subject;
    public CustomImmutableClass(int id, String name, List<String> subject)
    {
        this.id = id;
        this.name = name;
       //this.subject = subject;  not pass original object
        //this.subject=new ArrayList<>(subject);// defensive copy using copy constructor
        this.subject = (ArrayList<String>) ((ArrayList<String>) subject).clone();
    //using clone()
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    @Override
    protected Object clone()throws CloneNotSupportedException
    {
        return new CustomImmutableClass(this.id, this.name, new ArrayList<>(this.subject));

    }
    public List<String> getSubject()
    {
      //  return  subject; // not pass original object
        //return =new ArrayList<>(subject);// defensive copy using copy constructor
        return  (ArrayList<String>) ((ArrayList<String>) subject).clone();//using clone()
    }

    public static void main(String[] args)
    {
        List list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        CustomImmutableClass ci=new CustomImmutableClass(201,"sachin",list);
        System.out.println("before modification");
        System.out.println(ci.id);
        System.out.println(ci.name);
        System.out.println(ci.subject);
        System.out.println("========================================================");
        list.add("e");
        System.out.println("after modification");
        System.out.println(ci.getId());
        System.out.println(ci.getName());
        System.out.println(ci.getSubject());

    }


}
