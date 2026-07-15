package core_Java_coding_questions;

public class Test1 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++;
        System.out.println(x);//6
        System.out.println(y);//5
        y =x++ + x++;//6+7
        System.out.println(x);//8
        System.out.println(y);//13
        y=x++ + x++;
        System.out.println(x);
        System.out.println(y);
        y=x++ + ++x;
        System.out.println(x);//12
        System.out.println(y);//22
    }
}