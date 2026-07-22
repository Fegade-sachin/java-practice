package collection.Collection_set_Program;

import java.util.TreeSet;

public class NumbersLessThanSeven
{
	public static void main(String[] args)
	{
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(9);
        numbers.add(7);
        numbers.add(11);
        numbers.add(13);
        numbers.add(16);
        TreeSet<Integer> hedSet=(TreeSet<Integer>)numbers.headSet(7);
        System.out.println("Original tree set "+numbers);
        System.out.println("Numbers Less then 7"+hedSet);
    }
}
