package wildcards;

import java.util.ArrayList;
import java.util.List;

public class WhyNeedWildcards
{
    public static void prints(List<Number> list) {
        for (Number n : list) {
            System.out.println(n);

        }
//        List<Integer> list = new ArrayList<>();
//        print(list);   // ❌ Compile-time error

    }

//        Why? Because List<Integer> is NOT a subtype of List<Number>. Java generics are invariant.


    public static void print(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
        print(new ArrayList<Integer>());
        print(new ArrayList<Double>());
        print(new ArrayList<Float>());
    }
}
