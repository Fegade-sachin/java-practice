package multithreading;
 interface Demo
{
    void display();
}
public class AnonymousClass
{

    public static void main(String[] args) {
//        Demo demo = ()-> System.out.println("Hello");
//        demo.display();
        Demo demo = new Demo() {
            public void display() {
                System.out.println("Displaying anonymous class");
            }

        };
        demo.display();
    }

}
