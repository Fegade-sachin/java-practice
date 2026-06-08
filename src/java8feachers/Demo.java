package java8feachers;

public class Demo {
    @MyAnnotation(value = "Hello Annotation")
    public void display() {
        System.out.println("Method executed!");

        this.display2();
    }
    public void display2() {
        System.out.println("Method executed!");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.display();
    }
}
