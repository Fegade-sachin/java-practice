package custom_array_list;

import java.util.Arrays;

class CustomArray
{
    int size;
    int[] array;
    int CustomSize=10;
    public CustomArray()
    {
        this.size = size;
        array = new int[CustomSize];
    }

    public void add(int value)
    {
        if(size==array.length)
            {
                increaseSize();
            }
        array[size++]=value;
    }

    private void increaseSize()
    {
        int arraysize=array.length*2;
        array= Arrays.copyOf(array,arraysize);
    }

    public void  display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public int  getSize()
    {
        return size;
    }
    public void set(int value)
    {
        if(size<0 && 0<size)
        {
          throw new IndexOutOfBoundsException("invalid index");
        }
        array[size] = value;
        size++;
    }
    public int get(int index)
    {
        if(size<0 && 0<size)
        {
          throw new IndexOutOfBoundsException("invalid index");
        }
        return array[index];
    }

}
public class CustomArrayList
{

    public static void main(String[] args)
    {
        CustomArray li=new CustomArray();
        li.add(1);li.add(2);li.add(3);li.add(4);li.add(5);li.add(6);
        System.out.println(li.getSize());
        li.display();
        System.out.println(li.get(0));
        System.out.println(li);

    }
}
