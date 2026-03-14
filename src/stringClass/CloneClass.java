package stringClass;

import PatternUsingArray.RhombusPattern;

public class CloneClass implements Cloneable
{
    void method1()
    {
        System.out.println("method1");
    }
    public static void main(String[] args) throws CloneNotSupportedException
    {
        CloneClass aobj1=new CloneClass();
        CloneClass aobj2=(CloneClass)aobj1.clone();
        System.out.println("aobj1="+aobj1);
        System.out.println("aobj2="+aobj2);
    }
}
