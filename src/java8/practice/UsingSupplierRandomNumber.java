package java8.practice;
//Use Supplier to generate a random number.
import java.util.Random;
import java.util.function.Supplier;

public class UsingSupplierRandomNumber
{
    public static void main(String[] args) {
        Supplier supplier = () -> new Random().nextInt(100);
        for(int i=0;i<10;i++) {
            System.out.println("random Numbers "+supplier.get());
        }
    }
}
