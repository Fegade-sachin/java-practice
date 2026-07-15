package core_Java_coding_questions;

public class Test5 {

    static void change(int a) {
        a = a + 10;
    }

    public static void main(String[] args) {
        int x = 5;
        change(x);
        System.out.println(x);
    }
}