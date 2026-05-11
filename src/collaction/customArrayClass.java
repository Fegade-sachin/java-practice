package collaction;

import java.util.Arrays;

public class customArrayClass
{
    private static final int INITIAL_CAPACITY = 7;
    private Object[] customArray = {};
    int size = 0;

    public customArrayClass() {
        customArray = new Object[INITIAL_CAPACITY];

    }

    public void add(Object obj) {
        if (size == customArray.length) {
            increaseCapacity();
        }
        customArray[size++] = obj;
    }

    private void increaseCapacity() {
        int newCapacity = customArray.length * 2;
        customArray = Arrays.copyOf(customArray, newCapacity);

    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index Out of Bounds Index " + index + " Size = " + index);
        }
        return customArray[index];
    }

    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index Out of Bounds Index " + index + " Size = " + index);
        }
        Object removedElement  = customArray[index];
        for (int i = index; i < size - 1; i++)
        {
            customArray[i] = customArray[i + 1];
        }
        return removedElement ;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(customArray[i]);

        }
    }


    public static void main(String[] args) {
        customArrayClass customarr=new customArrayClass();
        customarr.add(1);
        customarr.add(2);
        customarr.add(3);
        customarr.add(4);
        customarr.add(5);
        customarr.add(6);
        customarr.add(7);
        customarr.add(8);
        customarr.add(9);
        customarr.add(10);
        customarr.add(11);
        System.out.println(customarr.size());
        System.out.println(customarr.get(0));
        System.out.println(customarr.customArray.length);

    }



}
