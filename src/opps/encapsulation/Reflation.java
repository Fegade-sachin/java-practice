package opps.encapsulation;

import java.lang.reflect.Field;
class Demo {
    private final StringBuilder text = new StringBuilder("Immutable");
    public StringBuilder getText() { return text; }
}

public class Reflation {
    public static void main(String[] args) throws Exception {
        Demo d = new Demo();
        Field f = Demo.class.getDeclaredField("text");
        f.setAccessible(true);
        StringBuilder sb = (StringBuilder) f.get(d);
        sb.replace(0, sb.length(), "Changed!");
        System.out.println(d.getText()); // prints "Changed!"
    }
}