package opps.encapsulation;

import java.lang.reflect.Field;
class ref {
    private final int number = 42;
    public int getNumber() { return number; }
}

public class EncapsulationRef {
    public static void main(String[] args) throws Exception {
        ref d = new ref();
        Field f = ref.class.getDeclaredField("number");
        f.setAccessible(true);
        f.setInt(d, 99); // reflection override
        System.out.println(d.getNumber()); // prints 99
    }
}
//it is not working