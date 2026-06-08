package java8feachers;

import java.lang.reflect.Method;

public class TestAnnotation {
    public static void main(String[] args) throws Exception {
        Method method = Demo.class.getMethod("display");
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

        System.out.println("Annotation value: " + annotation.value());
    }
}
