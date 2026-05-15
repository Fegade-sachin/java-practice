package collaction;

import java.util.Arrays;

public class CreateList
{
     private Object arr[]={};
     private int size;
    private int INITIALSIZE=5;
    public CreateList()
    {
        arr = new Object[INITIALSIZE];
        this.size = 0;
    }
    public void add(Object obj)
    {
        if(size==arr.length)
        {
            inicreasesize();
        }
        arr[size++]=obj;
    }
    public Object get( int index)
    {
        if(index<0 || index>=size)
        {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }
    void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    Object remove(int index)
    {
        if(index<0 || index>=size)
        {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Object removeEle=arr[index];
        for(int i=index;i<size-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[index]=null;
        size--;
        return removeEle;
    }
    private void inicreasesize()
    {
        int newarr= arr.length*2;
        arr= Arrays.copyOf(arr, newarr);

    }
    public void size()
    {
        return;
    }

    public static void main(String[] args)
    {
        CreateList list=new CreateList();
        list.display();
        System.out.println("Enter the size of the list");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
        System.out.println("Enter the element to be added to the list");
        list.remove(3);
        System.out.println("The list after removal");
        list.display();
        System.out.println(list.size);
    }
}
