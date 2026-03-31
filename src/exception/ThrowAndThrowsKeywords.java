package exception;
import java.io.*;
 class InvalidAge_Exception extends Exception {
    public InvalidAge_Exception(String msg) {
        super(msg);
    }
}
public class ThrowAndThrowsKeywords
{
    static int age= 15;



    public static void checkAge(int age) throws InvalidAge_Exception
    {
        if (age < 18) {
            throw new InvalidAge_Exception("Not eligible");
        }
    }


    public static void readFile() throws IOException {
        FileReader fr = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
    }
    public static void main(String[] args)
    {
        if (age < 18) {

            throw new RuntimeException("Not eligible");

        }

        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Handled in main");
        }
        }

}
